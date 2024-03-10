package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Category;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class CategoryImpl implements CategoryDAO {
    Session session = HibernateSession.getSessionFactory().openSession();

    @Override
    public List<Category> getAll() {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Category getOne(int id) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Category delete(int id) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Category update(int id) {
        session.beginTransaction();
        session.close();
        return null;
    }

    @Override
    public Category create(Category category) {
        session.beginTransaction();
        session.close();
        return null;
    }
}
