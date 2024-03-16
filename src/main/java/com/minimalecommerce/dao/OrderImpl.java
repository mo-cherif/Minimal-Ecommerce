package com.minimalecommerce.dao;

import com.minimalecommerce.entities.OrderLine;
import com.minimalecommerce.entities.Orderx;
import com.minimalecommerce.entities.Product;
import com.minimalecommerce.entities.User;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

public class OrderImpl implements   OrderDAO{
    Session session = HibernateSession.getSessionFactory().openSession();
    @Override
    public void create(Orderx order) {
        session.beginTransaction();
        System.out.println("hello");
        session.persist(order);
        session.getTransaction().commit();
        session.close();
    }
}
