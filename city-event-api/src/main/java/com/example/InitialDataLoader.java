package com.example;

import com.example.db.PrivilegeRepository;
import com.example.db.RoleRepository;
import com.example.db.UserRepository;
import com.example.entity.Privilege;
import com.example.entity.Role;
import com.example.entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
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

    public InitialDataLoader(RoleRepository roleRepository, PrivilegeRepository privilegeRepository, PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
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

        user.setPassword(passwordEncoder.encode("test"));

        user.setEmail("test@test.com");

        user.setRoles(Arrays.asList(adminRole));

        user.setTokenExpired(false);

        user.setEnabled(true);

        userRepository.save(user);

        alreadySetup = true;

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