package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String eventName;
    private String description;

    public Event(String eventName, String description) {
        this.eventName = eventName;
        this.description = description;
    }
}
