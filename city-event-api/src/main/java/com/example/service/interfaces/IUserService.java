package com.example.service.interfaces;

import com.example.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User save(User user);
    void delete(User user);
    User update(User user);
    Optional<User> getUser(Long id);
    List<User> getUsers();
}
