package com.example.manage_user.repository.impl;

import com.example.manage_user.model.User;
import com.example.manage_user.repository.IUserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public void insertUser(User user) {
        try {
            PreparedStatement preparedStatement =
                    BaseRepository.getConnection().
                            prepareStatement("insert into users (name,email,country) values (?,?,?);");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) throws SQLException {
        PreparedStatement preparedStatement =
                BaseRepository.getConnection().
                        prepareStatement("select * from users where id=?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        User user;
        if (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            user.setCountry(resultSet.getString("country"));
            return user;
        }
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> userList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from users;");
            ResultSet resultSet = preparedStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete;
        PreparedStatement preparedStatement =
                BaseRepository.getConnection().prepareStatement("delete from users where id=?;");
        preparedStatement.setInt(1, id);
        rowDelete = preparedStatement.executeUpdate() > 0;
        return rowDelete;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
boolean rowUpdated;
PreparedStatement preparedStatement =
        BaseRepository.getConnection().prepareStatement("update users set name=?,email=?,country=? where id=?;");
       preparedStatement.setString(1,user.getName());
       preparedStatement.setString(2,user.getEmail());
       preparedStatement.setString(3,user.getCountry());
       preparedStatement.setInt(4,user.getId());
       rowUpdated = preparedStatement.executeUpdate()>0;
        return rowUpdated;
    }
}
