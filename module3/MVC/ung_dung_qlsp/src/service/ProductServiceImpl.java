package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer , Product>  listProduct;
    static {
        listProduct = new HashMap<>();
        listProduct.put(1,new Product(1,"Laptop",2,"Dell",2000));
        listProduct.put(2,new Product(2,"Computer",2,"Desktop",3000));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id,product);
    }

    @Override
    public void remove(int id) {
        listProduct.remove(id);
    }
}
