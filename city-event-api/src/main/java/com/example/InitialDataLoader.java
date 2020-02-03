package com.example;

import com.example.db.PrivilegeRepository;
import com.example.db.RoleRepository;
import com.example.db.UserRepository;
import com.example.entity.Event;
import com.example.entity.Privilege;
import com.example.entity.Role;
import com.example.entity.User;
import com.example.service.interfaces.EventService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;
    private RoleRepository roleRepository;
    private PrivilegeRepository privilegeRepository;
    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;
    private EventService eventService;

    public InitialDataLoader(RoleRepository roleRepository, PrivilegeRepository privilegeRepository, PasswordEncoder passwordEncoder, UserRepository userRepository, EventService eventService) {
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.eventService = eventService;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (alreadySetup)
            return;

        Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
        Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

        List<Privilege> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege);
        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setPassword(passwordEncoder.encode("123"));
        user.setEmail("test@test.com");
        user.setRoles(Arrays.asList(adminRole));
        user.setTokenExpired(false);
        user.setEnabled(true);
        userRepository.save(user);
        alreadySetup = true;


        Event event1 = new Event("eventName 1" , "some description 1");
        Event event2 = new Event("eventName 2" , "some description 2");
        Event event3 = new Event("eventName 3" , "some description 3");
        List<Event> events = Arrays.asList(event1,event2,event3);

        events.forEach(targetEvent -> {
            targetEvent.setUser(user);
            this.eventService.save(targetEvent);
        } );



    }

    @Transactional
    Privilege createPrivilegeIfNotFound(String name) {
        Privilege privilege = privilegeRepository.findByName(name);

        if (privilege == null) {

            privilege = new Privilege(name);

            privilegeRepository.save(privilege);

        }

        return privilege;

    }

    @Transactional
    Role createRoleIfNotFound(String name, Collection<Privilege> privileges) {

        Role role = roleRepository.findByName(name);

        if (role == null) {

            role = new Role(name);

            role.setPrivileges(privileges);
            roleRepository.save(role);

        }
        return role;
    }
}