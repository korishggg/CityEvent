package com.example.cityeventservice.db;

import com.example.cityeventservice.entity.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Long> {
}
