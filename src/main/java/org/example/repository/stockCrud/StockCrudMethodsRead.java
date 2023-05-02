package org.example.repository.stockCrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.LoggingData;
import org.example.entity.Stock;

import java.util.List;
import java.util.Stack;

public class StockCrudMethodsRead {
    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");

    static EntityManager em = entityManagerFactory.createEntityManager();


    public static List<Stock> readAllStock(){

        em.getTransaction().begin();
        TypedQuery<Stock> query=em.createQuery("select s from Stock s", Stock.class);
        List<Stock> results= query.getResultList();

        em.getTransaction().commit();
        em.close();
        return results;
    }
}

