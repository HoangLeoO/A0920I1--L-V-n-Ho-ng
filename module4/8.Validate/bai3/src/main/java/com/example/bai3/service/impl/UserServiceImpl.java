package com.example.bai3.service.impl;

import com.example.bai3.model.User;
import com.example.bai3.repository.UserRepository;
import com.example.bai3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
