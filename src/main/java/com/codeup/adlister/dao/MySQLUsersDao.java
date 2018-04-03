package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.Connection;

public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public User findByUsername(String username){
        return null;
    }

    public Long insert(User user){
        return null;
    }
}
