package com.tutorials.jpahibernateembeddable;

import com.tutorials.jpahibernateembeddable.models.Address;
import com.tutorials.jpahibernateembeddable.models.Name;
import com.tutorials.jpahibernateembeddable.models.User;
import com.tutorials.jpahibernateembeddable.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateEmbeddableApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateEmbeddableApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Cleanup the users table
        userRepository.deleteAllInBatch();

        // Insert a new user in the database

        Name name = new Name("Rajeev", "Kumar", "Singh");
        Address address = new Address("747", "Golf View Road", "Bangalore", "Karnataka", "India", "560008");
        User user = new User(name, "rajeev@callicoder.com", address);

        userRepository.save(user);
    }

}

