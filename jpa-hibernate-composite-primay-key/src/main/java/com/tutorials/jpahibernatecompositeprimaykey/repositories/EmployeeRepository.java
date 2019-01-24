package com.tutorials.jpahibernatecompositeprimaykey.repositories;


import com.tutorials.jpahibernatecompositeprimaykey.models.Employee;
import com.tutorials.jpahibernatecompositeprimaykey.models.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

}