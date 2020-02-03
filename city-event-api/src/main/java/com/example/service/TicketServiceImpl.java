package com.example.service;

import com.example.db.TicketRepository;
import com.example.entity.Ticket;
import com.example.service.interfaces.TicketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket save(Ticket entity) {
        return this.ticketRepository.save(entity);
    }

    @Override
    public void delete(Ticket entity) {
        this.ticketRepository.delete(entity);
    }

    @Override
    public Ticket update(Ticket entity) {
        return this.ticketRepository.save(entity);
    }

    @Override
    public List<Ticket> getAll() {
        List list = new ArrayList();
        this.ticketRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Optional<Ticket> getByID(Long id) {
        return this.ticketRepository.findById(id);
    }
}
