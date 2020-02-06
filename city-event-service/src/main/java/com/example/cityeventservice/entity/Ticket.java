package com.example.cityeventservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Ticket implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Event> events;

    private double price;

    @ManyToMany
    private List<User> ticketOwners;

}
