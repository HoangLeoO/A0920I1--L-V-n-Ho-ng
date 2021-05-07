package dao.impl;

import dao.IProductDao;
import exception.PrintSQLException;
import model.Product;
import untils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl  implements IProductDao {
    private static final String INSERT_Product_SQL = "Insert into Product values (?, ?, ?, ?,?)";
    private static final String SELECT_Product_BY_ID = "Select * from Product where product_id = ?";
    private static final String SELECT_ALL_Product = "Select * from Product";

    @Override
    public void insertProduct(Product product) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionDB.getConnection();
            statement = connection.prepareStatement(INSERT_Product_SQL);
            statement.setString(1,product.getProduct_id());
            statement.setString(2,product.getProduct_name());
            statement.setFloat(3,product.getProduct_price());
            statement.setInt(4,product.getProduct_discount());
            statement.setInt(5,product.getProduct_stock());
            System.out.println(statement);
            statement.executeUpdate();
        } catch (SQLException e) {
            PrintSQLException.printSQLException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Product getProduct(String id) {
        Product product = null;
            try (Connection connection = ConnectionDB.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Product_BY_ID)) {

                //Create a statement using connection object
                preparedStatement.setString(1,id);
                System.out.println(preparedStatement);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    String product_id = resultSet.getString("product_id");
                    String product_name = resultSet.getString("product_name");
                    float product_price = resultSet.getFloat("product_price");
                    int product_discount = resultSet.getInt("product_discount");
                    int product_stock  = resultSet.getInt("product_stock");

                    product = new Product(product_id,product_name,product_price,product_discount,product_stock);
                }
                }catch (SQLException e) {
                PrintSQLException.printSQLException(e);
            }
            return product;
        }

    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();

        //Establishing a Connection
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Product)) {

            //Create a statement using connection object

            System.out.println(preparedStatement);

            // Execute the query or update query
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String product_id = resultSet.getString("product_id");
                String product_name = resultSet.getString("product_name");
                float product_price = resultSet.getFloat("product_price");
                int product_discount = resultSet.getInt("product_discount");
                int product_stock  = resultSet.getInt("product_stock");
                products.add(new Product(product_id,product_name,product_price,product_discount,product_stock));
            }

        } catch (SQLException e) {
            PrintSQLException.printSQLException(e);
        }
        return products;
    }
}
