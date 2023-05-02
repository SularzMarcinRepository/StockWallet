package org.example.repository.loggingDataCrud;

import jakarta.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.LoggingData;

import java.util.List;

public class LoggingDataCrudMethodsRead {
    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");

    static EntityManager em = entityManagerFactory.createEntityManager();

    public static String ReadUserLoggingData(long id) {

        LoggingData loggingData = em.find(LoggingData.class, id);
        em.getTransaction().begin();

        String login= loggingData.getLogin();
        return login;
    }
    public static List<LoggingData> ReadAllLoggingData(){

        em.getTransaction().begin();
        TypedQuery<LoggingData> query=em.createQuery("select l from LoggingData l", LoggingData.class);
        List<LoggingData> results= query.getResultList();
        em.getTransaction().commit();
        em.close();
        return results;
    }
}
