package com.laptopshop.demo.service;

import org.springframework.stereotype.Service;

import com.laptopshop.demo.domain.User;
import com.laptopshop.demo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "Hello from service";
    }

    public User handleSaveUser(User user) {
        User eric = this.userRepository.save(user);
        System.out.println(eric);
        return eric;
    }
}
