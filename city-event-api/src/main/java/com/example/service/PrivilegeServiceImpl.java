package com.example.service;

import com.example.db.PrivilegeRepository;
import com.example.db.TicketRepository;
import com.example.entity.Privilege;
import com.example.entity.Ticket;
import com.example.service.interfaces.PrivilegeService;
import com.example.service.interfaces.TicketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    private PrivilegeRepository privilegeRepository;

    public PrivilegeServiceImpl(PrivilegeRepository privilegeRepository) {
        this.privilegeRepository = privilegeRepository;
    }

    @Override
    public Privilege save(Privilege entity) {
        return this.privilegeRepository.save(entity);
    }

    @Override
    public void delete(Privilege entity) {
        this.privilegeRepository.delete(entity);
    }

    @Override
    public Privilege update(Privilege entity) {
        return this.privilegeRepository.save(entity);
    }

    @Override
    public List<Privilege> getAll() {
        List list = new ArrayList();
        this.privilegeRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Optional<Privilege> getByID(Long id) {
        return this.privilegeRepository.findById(id);
    }
}
