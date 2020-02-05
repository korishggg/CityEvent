package com.example.cityeventservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String eventName;
    private String description;

    public Event() {
    }

    public Event(String eventName, String description) {
        this.eventName = eventName;
        this.description = description;
    }

}
