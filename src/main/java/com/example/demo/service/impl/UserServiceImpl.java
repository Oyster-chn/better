package com.example.demo.service.impl;

import com.example.demo.model.User;

import java.util.List;

public interface UserServiceImpl {
    int add(User user);

    List<User> getAllUser();
}
