package com.example.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String eventName;
    private String description;

    @ManyToOne
    @JsonBackReference
    private User user;

    @ManyToMany
    private List<Ticket> tickets;


    public Event(String eventName, String description) {
        this.eventName = eventName;
        this.description = description;
    }



}
