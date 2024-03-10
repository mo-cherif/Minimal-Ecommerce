package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Category;
import com.minimalecommerce.entities.Product;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class ProductImpl implements ProductDAO {
    Session session = HibernateSession.getSessionFactory().openSession();

    @Override
    public Product create(Product product, int CategoryId) {
        session.beginTransaction();
        Category category = session.find(Category.class, CategoryId);
        product.setCategory(category);
        session.persist(product);
        session.getTransaction().commit();
        session.close();
        return product;
    }

    @Override
    public Product delete(int id) {
        session.beginTransaction();
        Product product = session.find(Product.class, id);
        session.remove(product);
        session.getTransaction().commit();
        session.close();
        return product;
    }

    @Override
    public Product getOne(int id) {
        session.beginTransaction();
        Product product = session.find(Product.class, id);
        session.close();
        return product;
    }

    @Override
    public Product update(int id, Product product) {
        session.beginTransaction();
        Product findedProduct = session.find(Product.class, id);
        findedProduct.setName(product.getName());
        findedProduct.setPrice(product.getPrice());
        findedProduct.setStatus(product.isStatus());
        findedProduct.setQuantity(product.getQuantity());
        session.update(findedProduct);
        session.getTransaction().commit();
        session.close();
        return findedProduct;
    }

    @Override
    public List<Product> getAll() {
        session.beginTransaction();
        List<Product> productList = session.createQuery("from Product ", Product.class).list();
        session.getTransaction().commit();
        session.close();
        return productList;
    }
}
