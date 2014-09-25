package com.company.repository;

import com.company.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SERGE on 25.09.2014.
 */
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<User>();

    {
        users.add(new User(1, "Name 1", "Surname 1"));
        users.add(new User(2, "Name 2", "Surname 2"));
        users.add(new User(3, "Name 3", "Surname 3"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User find(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
