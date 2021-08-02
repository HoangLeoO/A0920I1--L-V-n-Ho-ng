package com.example.thi_modul4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_type_id")
    private Long id ;

    @Column(name = "procduct_type_name")
    private String name ;

    @OneToMany(mappedBy = "productType")
    private List<Product> products ;

    public ProductType() {

    }

    public ProductType(Long id , String name , List<Product>  products) {
        this.id = id ;
        this.name = name;
        this.products = products ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
