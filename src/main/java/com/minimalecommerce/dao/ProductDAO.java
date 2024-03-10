package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Product;

import java.util.List;

public interface ProductDAO {
    Product create(Product product, int CategoryId);

    Product delete(int id);

    Product getOne(int id);

    Product update(int id, Product product);

    List<Product> getAll();
}
