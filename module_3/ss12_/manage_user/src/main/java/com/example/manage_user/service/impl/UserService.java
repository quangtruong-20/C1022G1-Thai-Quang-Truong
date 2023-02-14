package com.example.manage_user.service.impl;

import com.example.manage_user.model.User;
import com.example.manage_user.repository.IUserRepository;
import com.example.manage_user.repository.impl.UserRepository;
import com.example.manage_user.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    IUserRepository repository = new UserRepository();
    @Override
    public void insertUser(User user) throws SQLException {
        repository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        try {
            return repository.selectUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> selectAllUsers() {
        return repository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return repository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return repository.updateUser(user);
    }
}
