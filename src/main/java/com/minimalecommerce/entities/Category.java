package com.minimalecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Table(name = "category")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;

    @OneToMany
    private ArrayList<Product> productList = new ArrayList<Product>();


}
