package com.minimalecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class Orderx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private  String address;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order", cascade =CascadeType.PERSIST )
    private List<OrderLine> ordeLines;

}
