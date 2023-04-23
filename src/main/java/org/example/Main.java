package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entity.*;

import java.util.logging.Logger;

public class Main {

    private static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    public static void main(String[] args) {
        EntityManager em=entityManagerFactory.createEntityManager();

        em.getTransaction().begin();
        Users users=em.find(Users.class,1);







        em.close();
    }
}
