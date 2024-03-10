package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Product;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class ProductImpl implements ProductDAO {
    Session session = HibernateSession.getSessionFactory().openSession();

    @Override
    public Product create(Product product) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Product delete(int id) {
        session.beginTransaction();
        session.close();

        return null;
    }

    @Override
    public Product getOne(int id) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Product update(int id) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public List<Product> getAll() {
        session.beginTransaction();
        session.close();
        return null;
    }
}
