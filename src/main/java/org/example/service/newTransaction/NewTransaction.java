package org.example.service.newTransaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Transactions;
import org.example.service.LoggingUser;

import java.time.LocalDate;

public class NewTransaction {
    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static void newTransaction(){

        Transactions transactions= new Transactions();
        em.getTransaction().begin();
        transactions.setStockName(TransactionStockName.stockName);
        transactions.setUsers(LoggingUser.walletsUserID);
        transactions.setLocalDate(LocalDate.parse(TransactionAmountPriceAndDate.transactionDate));
        transactions.setStockAmount(TransactionAmountPriceAndDate.stockAmount);
        transactions.setPrice(TransactionAmountPriceAndDate.stockPrice);
        transactions.setTransactionType(TransactionBuyOrSell.transactionType);

        em.persist(transactions);
        logger.info(transactions);
        em.getTransaction().commit();
        em.close();
    }

}


