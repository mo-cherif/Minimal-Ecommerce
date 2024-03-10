package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Category;
import com.minimalecommerce.entities.Product;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAll();

    Category getOne(int id);

    Category delete(int id);

    Category update(int id, Category category);

    Category create(Category category);
}
