package com.example.jpahandson.runner;

import com.example.jpahandson.model.Employee;
import com.example.jpahandson.repository.EmployeeRepository;
import com.example.jpahandson.service.EmployeeHibernateService;
import com.example.jpahandson.service.EmployeeJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private EmployeeJpaService jpaService;

    @Autowired
    private EmployeeHibernateService hibernateService;

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void run(String... args) {
        jpaService.saveWithJPA();
        hibernateService.saveWithHibernate();
        repository.save(new Employee(12, "Spring Data JPA Employee"));
        System.out.println("Saved using Spring Data JPA");
    }
}
