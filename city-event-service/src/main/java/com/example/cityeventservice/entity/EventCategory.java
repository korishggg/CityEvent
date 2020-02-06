package com.example.cityeventservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class EventCategory {
    @Id
    @GeneratedValue
    private Long id;

    private String categoryName;

    @ManyToMany
    private List<SavedInfoBucket> savedInfoBuckets;
}
