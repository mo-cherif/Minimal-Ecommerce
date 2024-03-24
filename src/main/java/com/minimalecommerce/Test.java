package com.minimalecommerce;

import com.minimalecommerce.dao.*;
import com.minimalecommerce.entities.*;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        User user = User.builder()
                .username("mocherif")
                .password("cherif123")
                .build();

        Profile profile = Profile.builder()
                .address("somewhere")
                .firstName("Mohamed")
                .LastName("CHERIF")
                .user(user)
                .build();

        user.setProfile(profile);

        UserImpl user1 = new UserImpl();
        user1.create(user);


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
                .orderLines(new ArrayList<>())
                .category(category)
                .build();


        category.getProductList().add(product);
        CategoryImpl product1 = new CategoryImpl();
        product1.create(category);


        Orderx order = Orderx.builder()
                .date(new Date())
                .address("oasis")
                .ordeLines(new ArrayList<>())
                .user(user)
                .build();

        OrderLine orderLine = OrderLine.builder()
                .price(80)
                .quantity(2)
                .product(product)
                .order(order)
                .build();

        order.getOrdeLines().add(orderLine);

        OrderImpl order1 = new OrderImpl();
        order1.create(order);




    }
}
