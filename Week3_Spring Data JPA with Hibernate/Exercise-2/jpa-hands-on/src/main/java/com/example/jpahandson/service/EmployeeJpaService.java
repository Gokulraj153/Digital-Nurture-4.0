package com.example.jpahandson.service;

import com.example.jpahandson.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmployeeJpaService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveWithJPA() {
        Employee emp = new Employee(10, "JPA Employee");
        entityManager.persist(emp);
        System.out.println("Saved using JPA: " + emp);
    }
}
