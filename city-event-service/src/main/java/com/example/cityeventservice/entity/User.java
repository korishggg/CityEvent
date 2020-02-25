package com.example.cityeventservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String userName;

    private String email;

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

    @ManyToMany
    private List<Role> roles;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.isActive = true;
    }
}
