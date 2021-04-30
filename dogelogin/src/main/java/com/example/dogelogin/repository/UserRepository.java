package com.example.dogelogin.repository;

import com.example.dogelogin.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(User user) {
        em.persist(user);
    }


}
