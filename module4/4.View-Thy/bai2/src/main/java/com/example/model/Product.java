package com.example.model;

public class Product {
    private int id ;
    private String name ;
    private float price ;
    private int Number;

    public Product() {
    }

    public Product(int id, String name, float price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
