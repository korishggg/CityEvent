package com.example.cityeventservice.db;

import com.example.cityeventservice.entity.Role;
import com.example.cityeventservice.entity.RoleName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleUser);
}
