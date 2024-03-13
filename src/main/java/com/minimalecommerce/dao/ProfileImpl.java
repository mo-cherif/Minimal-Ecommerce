package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Profile;
import com.minimalecommerce.entities.User;
import com.minimalecommerce.utils.HibernateSession;
import org.hibernate.Session;

public class ProfileImpl implements ProfileDAO {
    Session session = HibernateSession.getSessionFactory().openSession();
    @Override
    public void create(Profile profile, int userId) {
        session.beginTransaction();
        User user = session.find(User.class,userId);
        profile.setUser(user);
        session.persist(profile);
        session.getTransaction().commit();
        session.close();
    }
}
