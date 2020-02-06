package com.example.cityeventservice.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class SavedInfoBucket {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private User user;

    @ManyToMany
    private List<EventCategory> likedEventCategories;

    @ManyToMany
    private List<Event> savedEvents;


}