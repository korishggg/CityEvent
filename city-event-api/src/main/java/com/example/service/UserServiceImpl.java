package com.example.service;

import com.example.db.UserRepository;
import com.example.entity.User;
import com.example.service.interfaces.UserService;
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
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public Optional<User> getByID(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        this.userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }
}
