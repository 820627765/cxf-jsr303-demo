package com.example.service;

import com.example.domain.User;

import javax.jws.WebService;
import java.util.List;

/**
 * @WebService 注解表示把该接口标注为WebService接口，如此才能被远程调用
 * 该注解需要在JDK1.6以上才可以使用
 */
@WebService
public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    List<User> findAllUser();

    User findById(Integer id);
}
