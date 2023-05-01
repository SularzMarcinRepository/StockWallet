package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.Stock;
import org.example.entity.TransactionType;
import org.example.entity.Transactions;
import org.example.entity.Users;

import java.time.LocalDate;

public class Main {



    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

        EntityManager em=entityManagerFactory.createEntityManager();



            em.getTransaction().begin();

            Users users=em.find(Users.class,2l);
            Stock stock=em.find(Stock.class,3l);
            Transactions transaction = new Transactions();
            transaction.setLocalDate(LocalDate.now());
            transaction.setStockamount(10);
            transaction.setUsers(users);
            transaction.setStock(stock);
            transaction.setTransactionType(TransactionType.BUY);
            transaction.setPrice(12.50);

            em.persist(transaction);
            em.getTransaction().commit();
            em.close();





    }
}
