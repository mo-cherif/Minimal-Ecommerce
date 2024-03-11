package com.minimalecommerce;

import com.minimalecommerce.dao.CategoryImpl;
import com.minimalecommerce.dao.ProductDAO;
import com.minimalecommerce.dao.ProductImpl;
import com.minimalecommerce.entities.Category;
import com.minimalecommerce.entities.Product;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Category category = Category.builder()
                .name("Vetements")
                .description("Catalogue de vetements")
                .productList(new ArrayList<>())
                .build();


        Product product = Product.builder()
                .name("T-shirt")
                .status(false)
                .price(20)
                .quantity(10)
                .category(category)
                .build();


        category.getProductList().add(product);
        System.out.println(category.getProductList().size());
        CategoryImpl product1 = new CategoryImpl();
        product1.create(category);

    }
}
