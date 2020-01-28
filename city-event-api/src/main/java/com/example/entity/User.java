package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

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

    @OneToOne
    private Role role;

    public User(String email, String password, String firstName, String lastName, Role role) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
}
