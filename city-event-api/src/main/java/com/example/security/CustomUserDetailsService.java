package com.example.security;


import com.example.entity.User;
import com.example.service.interfaces.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userService
                .getUserByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " haven`t been founded"));

        return new CustomUserDetails(user);
    }
}
