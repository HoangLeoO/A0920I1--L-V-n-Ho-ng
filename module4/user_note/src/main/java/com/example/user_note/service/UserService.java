package com.example.user_note.service;

import com.example.user_note.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
