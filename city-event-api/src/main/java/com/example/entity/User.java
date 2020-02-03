package com.example.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private boolean tokenExpired;

    @ManyToMany(mappedBy = "users")
    @JsonBackReference
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;


    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Event> events;

    @ManyToMany
    private List<Ticket> tickets;

    public User(String email, String password, String firstName, String lastName, List<Role> roles) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "User{" +
                "roles=" + roles +
                '}';
    }
}
