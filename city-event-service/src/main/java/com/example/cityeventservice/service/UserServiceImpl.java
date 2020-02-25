package com.example.cityeventservice.service;

import com.example.cityeventservice.db.UserRepository;
import com.example.cityeventservice.entity.User;
import com.example.cityeventservice.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User entity) {
        return this.userRepository.save(entity);
    }

    @Override
    public void delete(User entity) {
        this.userRepository.delete(entity);
    }

    @Override
    public User update(User entity) {
        return this.userRepository.save(entity);
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public Optional<User> getById(Long id) {
        return this.userRepository.findById(id);
    }
}

