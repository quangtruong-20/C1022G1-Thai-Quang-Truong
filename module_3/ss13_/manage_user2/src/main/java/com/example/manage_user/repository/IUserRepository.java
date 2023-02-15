package com.example.manage_user.repository;

import com.example.manage_user.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    void insert(User user) throws SQLException;
    User select(int id) throws SQLException;
    List<User> selectAll(String search);
    void delete(int id) throws SQLException;
    void update(User user)throws SQLException;
}
