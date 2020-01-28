package com.example.service;

import com.example.db.EventRepository;
import com.example.entity.Event;
import com.example.service.interfaces.EventService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event save(Event entity) {
        return eventRepository.save(entity);
    }

    @Override
    public void delete(Event entity) {
        eventRepository.delete(entity);
    }

    @Override
    public Event update(Event entity) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    @Override
    public Optional<Event> getByID(Long id) {
        return this.eventRepository.findById(id);
    }
}
