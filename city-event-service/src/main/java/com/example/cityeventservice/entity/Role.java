package com.example.cityeventservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
