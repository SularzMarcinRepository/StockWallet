package org.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Users;

public class CrudMethodsCreate {

    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static void createUser(){

        Users user= new Users();
        em.getTransaction().begin();

        em.persist(user);
        logger.info(user);
        em.getTransaction().commit();
        em.close();
    }
    public static void createUserWithData(String name,String surname){

        Users user= new Users();
        user.setName(name);
        user.setSurname(surname);

        em.getTransaction().begin();

        em.persist(user);
        logger.info(user);

        em.getTransaction().commit();
        em.close();
    }

}
