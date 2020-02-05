package com.example.cityeventservice;

import com.example.cityeventservice.entity.Event;
import com.example.cityeventservice.service.interfaces.EventService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private EventService eventService;

    public InitialDataLoader(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Event event1 = new Event("eventName 1" , "some description 1");
        Event event2 = new Event("eventName 2" , "some description 2");
        Event event3 = new Event("eventName 3" , "some description 3");
        List<Event> events = Arrays.asList(event1,event2,event3);

        events.forEach(targetEvent -> { this.eventService.save(targetEvent); } );
        this.eventService.getAll().forEach(System.out::println);

    }

//    @Transactional
//    Privilege createPrivilegeIfNotFound(String name) {
//        Privilege privilege = privilegeRepository.findByName(name);
//
//        if (privilege == null) {
//
//            privilege = new Privilege(name);
//
//            privilegeRepository.save(privilege);
//
//        }
//
//        return privilege;
//
//    }

}