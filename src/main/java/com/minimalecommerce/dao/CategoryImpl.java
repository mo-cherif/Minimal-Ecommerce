package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Category;
import com.minimalecommerce.entities.Product;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class CategoryImpl implements CategoryDAO {
    Session session = HibernateSession.getSessionFactory().openSession();

    @Override
    public List<Category> getAll() {
        session.beginTransaction();
        List<Category> categoryList = session.createQuery("from Category ", Category.class).list();
        session.getTransaction().commit();
        session.close();
        return categoryList;
    }

    @Override
    public Category getOne(int id) {
        session.beginTransaction();
        Category category = session.find(Category.class, id);
        session.close();
        return category;
    }

    @Override
    public Category delete(int id) {
        session.beginTransaction();
        Category category = session.find(Category.class, id);
        session.remove(category);
        session.close();
        return category;
    }

    @Override
    public Category update(int id, Category category) {
        session.beginTransaction();
        Category findedCategory = session.find(Category.class,id);
        findedCategory.setName(category.getName());
        findedCategory.setDescription(category.getName());
        session.update(findedCategory);

        session.getTransaction().commit();
        session.close();
        return findedCategory;
    }

    @Override
    public Category create(Category category) {
        session.beginTransaction();
        session.persist(category);
        session.getTransaction().commit();
        session.close();
        return category;
    }
}
