package com.minimalecommerce.dao;


import com.minimalecommerce.entities.OrderLine;
import com.minimalecommerce.entities.Orderx;
import com.minimalecommerce.entities.Product;
import com.minimalecommerce.entities.User;

public interface OrderDAO {
    void create(Orderx order);
}
