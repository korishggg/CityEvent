package com.example.service;

import com.example.db.UserRepository;
import com.example.entity.User;
import com.example.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User update(User user) {
//        TODO should implement that one
        return null;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> users.add(user));

        return users;
    }
}
