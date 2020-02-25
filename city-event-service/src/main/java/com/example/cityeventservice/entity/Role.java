package com.example.cityeventservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(RoleName roleName) {
        this.name = roleName;
    }
}
