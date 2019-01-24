package com.tutorials.jpahibernatecompositeprimaykey;

import com.tutorials.jpahibernatecompositeprimaykey.models.Employee;
import com.tutorials.jpahibernatecompositeprimaykey.models.EmployeeIdentity;
import com.tutorials.jpahibernatecompositeprimaykey.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateCompositePrimayKeyApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateCompositePrimayKeyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        // Cleanup employees table
        employeeRepository.deleteAllInBatch();

        // Insert a new Employee in the database
        Employee employee = new Employee(new EmployeeIdentity("E-123", "D-457"),
                "Rajeev Kumar Singh",
                "rajeev@callicoder.com",
                "+91-9999999999");

        employeeRepository.save(employee);
    }

}

