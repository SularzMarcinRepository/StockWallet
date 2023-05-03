package org.example.repository.usersCrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.LoggingData;
import org.example.entity.Users;

import java.math.BigDecimal;

public class UsersCrudMethodsCreate {

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
    public static void createUserWithData(String name, String surname, LoggingData loggingData){

        Users user= new Users();
        user.setName(name);
        user.setSurname(surname);
        user.setBalance(new BigDecimal(0.0));
        user.setLoggingData(loggingData);
        loggingData.setUsers(user);

        em.getTransaction().begin();

        em.persist(user);
        logger.info(user);

        em.getTransaction().commit();
        em.close();
    }

}
