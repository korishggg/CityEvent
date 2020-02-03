package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ticket implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<User> users;

    private Double price;

    @ManyToMany
    private List<Event> events;

}
