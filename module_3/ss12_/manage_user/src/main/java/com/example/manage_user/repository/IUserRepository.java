package com.example.manage_user.repository;

import com.example.manage_user.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void insertUser(User user) throws SQLException;
    public User selectUser(int id) throws SQLException;
    public List<User> selectAllUsers();
    public boolean deleteUser(int id) throws SQLException;
    public boolean updateUser(User user)throws SQLException;
}
