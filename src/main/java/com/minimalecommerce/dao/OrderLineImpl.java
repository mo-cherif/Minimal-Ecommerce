package com.minimalecommerce.dao;

import com.minimalecommerce.entities.OrderLine;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

public class OrderLineImpl implements  OrderLineDAO{
    Session session = HibernateSession.getSessionFactory().openSession();
    @Override
    public void create(OrderLine orderLine) {
        session.beginTransaction();
        session.persist(orderLine);
        session.getTransaction().commit();
        session.close();
    }
}
