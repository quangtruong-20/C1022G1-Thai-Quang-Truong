package com.example.casestudy.repository.impl;

import com.example.casestudy.model.Product;
import com.example.casestudy.repository.IProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("select id_sp,ten_sp,don_gia from product;");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()) {
                product = new Product();
                product.setId_sp(resultSet.getInt("id_sp"));
                product.setTen_sp(resultSet.getString("ten_sp"));
                product.setDon_gia(resultSet.getString("don_gia"));
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;

    }

    @Override
    public void insert(Product product) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().
                            prepareStatement("insert into product (ten_sp,don_gia) values (?,?);");
            preparedStatement.setString(1, product.getTen_sp());
            preparedStatement.setString(2, product.getDon_gia());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(int id_sp) {
        PreparedStatement preparedStatement ;
        try {

            preparedStatement =  BaseRepository.getConnection().
                    prepareStatement("select * from product where id_sp= ?;");
            preparedStatement.setInt(1,id_sp);
            ResultSet resultSet = preparedStatement.executeQuery();

            Product product;
            if (resultSet.next()) {
                product = new Product();
                product.setId_sp(resultSet.getInt("id_sp"));
                product.setTen_sp(resultSet.getString("ten_sp"));
                product.setDon_gia(resultSet.getString("don_gia"));

                return product;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void delete(int id_sp) throws SQLException {
        PreparedStatement preparedStatement =
                BaseRepository.getConnection().prepareStatement("delete from product where id_sp=?;");
        preparedStatement.setInt(1, id_sp);
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(Product product) throws SQLException {
        PreparedStatement preparedStatement =
                BaseRepository.getConnection().prepareStatement("update product set ten_sp=?,don_gia=? where id_sp=?;");
        preparedStatement.setString(1,product.getTen_sp());
        preparedStatement.setString(2,product.getDon_gia());
        preparedStatement.setInt(3,product.getId_sp());
        preparedStatement.executeUpdate();
    }
}
