package com.company.service;

import com.company.domain.User;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by SERGE on 25.09.2014.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void showAllUsers() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public void showUser(int id) {
        User user = userRepository.find(id);
        System.out.println(user);
    }
}
