package org.example.service.stockBuy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.TransactionType;
import org.example.entity.Transactions;
import org.example.entity.Users;
import org.example.service.LoggingUser;

import java.time.LocalDate;

public class StockBuyMethod {
    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static void newBuyTransaction(){

        Transactions transactions= new Transactions();
        em.getTransaction().begin();
        transactions.setStock(StockBuyId.buyStockId);
        transactions.setUsers(LoggingUser.walletsUserID);
        transactions.setLocalDate(LocalDate.parse(StockBuyAmountPriceAndDate.stockBuyDate));
        transactions.setStockamount(StockBuyAmountPriceAndDate.stockAmount);
        transactions.setPrice(StockBuyAmountPriceAndDate.stockPrice);
        transactions.setTransactionType(TransactionType.BUY);

        em.persist(transactions);
        logger.info(transactions);
        em.getTransaction().commit();
        em.close();
    }

}


