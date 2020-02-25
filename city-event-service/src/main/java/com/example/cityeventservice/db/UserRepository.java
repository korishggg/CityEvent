package com.example.cityeventservice.db;

import com.example.cityeventservice.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByEmailOrUserName(String userNameOrEmail, String emailOrUserName);
    boolean existsByUserName(String username);
    boolean existsByEmail(String email);
}


