//package com.example.controller;
//
//import com.example.entity.Event;
//import com.example.service.interfaces.EventService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//@RequestMapping("/events")
//public class EventRestController {
//
//    private EventService eventService;
//
//    public EventRestController(EventService eventService) {
//        this.eventService = eventService;
//    }
//
//    @GetMapping
//    public List<Event> findAllEvents(){
//        return this.eventService.getAll();
//    }
//
////    @PostMapping("/{id}")
////    public Event bookTicket(@PathVariable Long id){
//////        return this.eventService.bookTicket(id);
////    }
// }
