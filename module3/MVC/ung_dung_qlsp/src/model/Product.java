package model;

public class Product {
    private int id ;
    private String nameProduct ;
    private int numberProduct ;
    private String typeProduct ;
    private float price ;

    public Product() {
    }

    public Product(int id, String nameProduct, int numberProduct, String typeProduct, float price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.numberProduct = numberProduct;
        this.typeProduct = typeProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
