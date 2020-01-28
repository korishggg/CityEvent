package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String roleName;

    @OneToOne
    private User user;
}
