package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAll();
    Category getOne(int id);
    Category delete(int id);
    Category update(int id);
    Category create(Category category);
}
