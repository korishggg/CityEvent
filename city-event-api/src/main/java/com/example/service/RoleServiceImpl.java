package com.example.service;


import com.example.db.RoleRepository;
import com.example.entity.Role;
import com.example.service.interfaces.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role entity) {
        return roleRepository.save(entity);
    }

    @Override
    public void delete(Role entity) {
        roleRepository.delete(entity);
    }

    @Override
    public Role update(Role entity) {
        return null;
    }

    @Override
    public List<Role> getAll() {
        List<Role> events = new ArrayList<>();
        roleRepository.findAll().forEach(events::add);
        return events;
    }

    @Override
    public Optional<Role> getByID(Long id) {
        return this.roleRepository.findById(id);
    }
}
