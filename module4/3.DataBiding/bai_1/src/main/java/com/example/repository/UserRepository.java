package com.example.repository;

import com.example.model.User;
import com.example.model.Login;

public interface UserRepository {
     User checkLogin (Login login);
}
