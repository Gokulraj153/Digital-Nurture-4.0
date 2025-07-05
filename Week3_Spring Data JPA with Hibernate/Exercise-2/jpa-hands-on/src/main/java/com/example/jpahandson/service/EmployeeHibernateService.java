package com.example.jpahandson.service;

import com.example.jpahandson.model.Employee;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeHibernateService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void saveWithHibernate() {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.beginTransaction();

        Employee emp = new Employee(11, "Hibernate Employee");
        session.persist(emp);

        session.getTransaction().commit();
        session.close();

        System.out.println("Saved using Hibernate: " + emp);
    }
}
