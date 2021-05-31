package com.example.user_note.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
