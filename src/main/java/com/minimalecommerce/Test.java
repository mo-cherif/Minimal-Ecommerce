package com.minimalecommerce;

import com.minimalecommerce.dao.CategoryImpl;
import com.minimalecommerce.dao.UserDAO;
import com.minimalecommerce.dao.UserImpl;
import com.minimalecommerce.entities.Category;
import com.minimalecommerce.entities.Product;
import com.minimalecommerce.entities.Profile;
import com.minimalecommerce.entities.User;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        User user = User.builder()
                .username("mocherif")
                .password("cherif123")
                .build();

        Profile profile = Profile.builder()
                .address("oasis casablanca")
                .firstName("Mohamed")
                .LastName("CHERIF")
                .user(user)
                .build();

        user.setProfile(profile);

        UserImpl user1 = new UserImpl();
        user1.create(user);



//        Category category = Category.builder()
//                .name("Vetements")
//                .description("Catalogue de vetements")
//                .productList(new ArrayList<>())
//                .build();
//
//
//        Product product = Product.builder()
//                .name("T-shirt")
//                .status(false)
//                .price(20)
//                .quantity(10)
//                .category(category)
//                .build();
//
//
//        category.getProductList().add(product);
//        System.out.println(category.getProductList().size());
//        CategoryImpl product1 = new CategoryImpl();
//        product1.create(category);

    }
}
