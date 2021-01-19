package com.evgeny.spring.rest;

import com.evgeny.spring.rest.entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test111 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();

            City city = new City("вуdfgerув", "2уцвewfewf-1");

            session.beginTransaction();
            session.save(city);
            session.getTransaction().commit();

            System.out.println("DONE!");
        } finally {
            factory.close();
        }
    }
}

