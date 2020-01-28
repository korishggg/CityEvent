package com.example.service.interfaces;

import com.example.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService  extends DefaultDAOGenericService<User>{
    Optional<User> getUserByEmail(String email);
}
