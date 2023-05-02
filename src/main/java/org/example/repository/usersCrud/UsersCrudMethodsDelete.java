package org.example.repository.usersCrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Users;

public class UsersCrudMethodsDelete {

    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static void DeleteUser(long id){

        Users user= em.find(Users.class,id);
        em.getTransaction().begin();

        em.remove(user);
        logger.info(user);

        em.getTransaction().commit();
        em.close();
    }


}
