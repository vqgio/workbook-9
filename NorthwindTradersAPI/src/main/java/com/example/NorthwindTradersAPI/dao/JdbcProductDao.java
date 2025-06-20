package com.example.NorthwindTradersAPI.dao;

import com.example.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcProductDao implements ProductDao {
    private DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String query = "SELECT * FROM products;";

        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(query);
            while(rows.next()) {
                Product product = new Product();
                product.setProductId(Integer.parseInt(rows.getString("ProductID")));
                product.setProductName(rows.getString("ProductName"));
                product.getCategoryId(rows.getString("CategoryID"));
                product.getUnitPrice(rows.getString("UnitPrice"));
                products.add(product);
            }
        }
        catch (SQLException e){ System.out.println(e);}
        return products;
    }
    @Override
    public Product getById(int id) {
        return null;
    }
}
