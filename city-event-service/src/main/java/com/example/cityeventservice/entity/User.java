package com.example.cityeventservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;

    private boolean isActive;

    private String country;

    private String city;

    @OneToMany(mappedBy = "owner")
    private List<Event> createdEvents;

    @OneToOne
    private SavedInfoBucket savedInfo;

    @ManyToMany
    private List<Ticket> tickets;

    @ManyToOne
    private Role role;

}
