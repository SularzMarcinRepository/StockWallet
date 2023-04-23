package org.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Users;

public class CrudMethodsRead {

    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static void ReadUser(long id){


        Users user= em.find(Users.class,id);
        em.getTransaction().begin();


        logger.info("użytkownik pod id"+ " " + id + "ma następujące dane osobowe- Imie:" + " "  + user.getName() + " " + "Nazwisko:" + " " + user.getSurname());

        em.getTransaction().commit();
        em.close();
    }


}
