package org.example.repository.loggingDataCrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.LoggingData;
import org.example.entity.Users;

public class LoggingDataCrudMethodsCreate {

        static Logger logger = LogManager.getLogger(Main.class);
        static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

        static EntityManager em=entityManagerFactory.createEntityManager();
        public static LoggingData createLoggingData(String login, String password){
        LoggingData newloggingData= new LoggingData();
        em.getTransaction().begin();
        newloggingData.setLogin(login);
        newloggingData.setPassword(password);

        em.persist(newloggingData);
        em.getTransaction().commit();
        em.close();
        return newloggingData;

    }
}
