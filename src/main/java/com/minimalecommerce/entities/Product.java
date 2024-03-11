package com.minimalecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @Column(name = "status", columnDefinition = "BOOLEAN")
    private boolean status;
    private int quantity;

    @ManyToOne
    private Category category;

}
