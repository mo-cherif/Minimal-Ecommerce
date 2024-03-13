package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Profile;
import com.minimalecommerce.entities.User;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

public class UserImpl implements UserDAO {

    Session session = HibernateSession.getSessionFactory().openSession();
    @Override
    public void create(User user) {
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }
}
