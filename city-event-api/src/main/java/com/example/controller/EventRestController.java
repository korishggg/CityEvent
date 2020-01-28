package com.example.controller;

import com.example.entity.Event;
import com.example.service.interfaces.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventRestController {

    private EventService eventService;

    public EventRestController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> findAllEvents(){
        Event event1 = new Event("eventName 1" , "some description 1");
        Event event2 = new Event("eventName 2" , "some description 2");
        Event event3 = new Event("eventName 3" , "some description 3");
        return List.of(event1,event2,event3);
    }
 }
