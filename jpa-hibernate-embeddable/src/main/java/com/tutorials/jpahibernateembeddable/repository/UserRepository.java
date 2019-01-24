package com.tutorials.jpahibernateembeddable.repository;
import com.tutorials.jpahibernateembeddable.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}