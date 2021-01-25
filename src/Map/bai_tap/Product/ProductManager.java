package Map.bai_tap.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Điên thoại", 2000000);
        Product product2 = new Product(2, "Máy tính", 3330000);
        Product product3 = new Product(3, "Ti vi", 400000);
        Product product4 = new Product(4, "Tủ lạnh", 5000000);
        Product product5 = new Product(5, "Bàn ủi", 900000);
        Product product6 = new Product(6, "Máy giặt", 1000000);
        List<Product> ListProduct = new ArrayList<>();
        ListProduct.add(product1);
        ListProduct.add(product2);
        ListProduct.add(product3);
        ListProduct.add(product4);
        ListProduct.add(product5);
        ListProduct.add(product6);

        System.out.println(ListProduct);
    }
}
