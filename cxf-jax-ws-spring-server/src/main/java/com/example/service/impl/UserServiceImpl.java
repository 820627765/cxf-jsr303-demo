package com.example.service.impl;

import com.example.domain.User;
import com.example.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("保存用户" + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("修改用户" + user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "zs", 20));
        list.add(new User(2, "ls", 22));
        return list;
    }

    @Override
    public User findById(Integer id) {
        return new User(1, "zs", 20);
    }
}
