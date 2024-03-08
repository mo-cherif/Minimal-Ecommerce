package com.minimalecommerce.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;

    @OneToMany
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Category(String name, String description, ArrayList<Product> productList) {
        this.name = name;
        this.description = description;
        this.productList = productList;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
