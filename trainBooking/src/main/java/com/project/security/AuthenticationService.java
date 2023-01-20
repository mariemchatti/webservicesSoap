package com.project.security;

import com.project.user.User;
import com.project.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    public AuthenticationService() {}

    public String authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && password.equals(user.getPassword())) {
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            userRepository.save(user);
            return token;
        } else {
            return null;
        }
    }
    public boolean signup(String username, String password, String firstname,
                          String lastname, String email) {
        if (userRepository.findByUsername(username) == null) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            user.setFirstname(firstname);
            user.setLastname(lastname);
            userRepository.saveAndFlush(user);
            return true;
        } else {
            return false;
        }
    }

}
