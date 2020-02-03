package com.example.service.interfaces;

import com.example.entity.Event;

public interface EventService extends DefaultDAOGenericService<Event>{
    void bookTicket(Long id);
}
