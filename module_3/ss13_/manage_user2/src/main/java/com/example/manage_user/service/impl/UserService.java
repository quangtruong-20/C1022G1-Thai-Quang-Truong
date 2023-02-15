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
    public void insert(User user) throws SQLException {
        repository.insert(user);
    }

    @Override
    public User select(int id) {
        try {
            return repository.select(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> selectAll(String search) {
        if (search == null){
            search="";
        }
        return repository.selectAll(search);
    }

    @Override
    public void delete(int id) throws SQLException {
        repository.delete(id);
    }

    @Override
    public void update(User user) throws SQLException {
        repository.update(user);
    }
}
