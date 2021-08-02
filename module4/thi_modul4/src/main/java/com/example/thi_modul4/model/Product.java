package com.example.thi_modul4.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id ;

    @NotBlank(message = "Tên không được để trống")
    @Column(name = "product_name")
    @Size(min = 5 ,max = 50 ,message = "Ký tự từ 5 đến 50")
    private String name ;

    @NotBlank(message = "Giá ban  đầu không được để trống")
    @Column(name = "product_price")
    private String price ;

    @NotBlank(message = "trạng thái không được để trống")
    @Column(name = "product_status")
    @Size(min = 5 ,max = 50 ,message = "Ký tự từ 5 đến 50")
    private String status ;

    @ManyToOne
    @JoinColumn(name = "productTypeId")
    private ProductType productType ;

    public Product() {
    }

    public Product(Long id ,String name ,String price,String status  , ProductType productType  ){
        this.id = id ;
        this.name = name ;
        this.price = price ;
        this.status = status ;
        this.productType = productType ;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
