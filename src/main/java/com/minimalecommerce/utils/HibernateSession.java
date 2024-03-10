package com.minimalecommerce.utils;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
    @Getter
    static SessionFactory sessionFactory = new Configuration()
            .configure().buildSessionFactory();

}
