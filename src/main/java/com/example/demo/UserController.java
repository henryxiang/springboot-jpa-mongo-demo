package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class UserController {
    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        String jpql = "SELECT u FROM User u JOIN FETCH u.roles";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        return query.getResultList();
    }
}
