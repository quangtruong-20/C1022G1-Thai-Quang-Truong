package com.example.manage_user.service;

import com.example.manage_user.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insert(User user) throws SQLException;
     User select(int id);
    List<User> selectAll(String search);
    void delete(int id) throws SQLException;
  void update(User user)throws SQLException;
}
