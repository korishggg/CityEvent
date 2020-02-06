package com.example.cityeventservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String eventName;

    private String country;

    private String city;

    private Date startDate;

    private Date endDate;

    private String description;

    @ManyToOne
    private User owner;

    @ManyToMany
    private List<SavedInfoBucket> savedInfoBuckets;

    @ManyToMany
    private List<Ticket> tickets;

    public Event(String eventName, String description) {
        this.eventName = eventName;
        this.description = description;
    }

}
