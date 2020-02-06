package com.example.cityeventservice.db;

import com.example.cityeventservice.entity.SavedInfoBucket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedInfoBucketRepository extends CrudRepository<SavedInfoBucket, Long> {
}