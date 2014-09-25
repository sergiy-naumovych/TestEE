package com.company.repository;

import com.company.domain.User;

import java.util.List;

/**
 * Created by SERGE on 25.09.2014.
 */
public interface UserRepository {
    public List<User> findAll();

    public User find(int id);
}
