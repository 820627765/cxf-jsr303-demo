package com.example.service;

import com.example.User1;

import javax.jws.WebService;
import java.util.List;


@WebService
public interface UserService {
    void saveUser(User1 user);

    void updateUser(User1 user);

    List<User1> findAllUser();

    User1 findById(Integer id);
}
