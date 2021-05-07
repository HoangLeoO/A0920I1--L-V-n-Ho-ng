package dao;

import model.Product;

import java.util.List;

public interface IProductDao {
    void insertProduct(Product product);
    Product getProduct(String id);
    List<Product> getAllProduct();
}
