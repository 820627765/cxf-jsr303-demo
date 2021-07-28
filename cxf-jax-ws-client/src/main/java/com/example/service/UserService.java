package com.example.service;

import com.example.domain.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    List<User> findAllUser();

    User findById(Integer id);
}
