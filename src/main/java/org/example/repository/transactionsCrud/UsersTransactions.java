package org.example.repository.transactionsCrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Transactions;
import org.example.entity.Users;

import java.util.List;

public class UsersTransactions {
    static Logger logger = LogManager.getLogger(Main.class);
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("unit");

    static EntityManager em=entityManagerFactory.createEntityManager();

    public static List<Transactions> ReadUsersStock(Users id) {

        em.getTransaction().begin();

        TypedQuery<Transactions> query= em.createQuery("select t from Transactions t where t.users=:id", Transactions.class);
        query.setParameter("id",id);
        List<Transactions> result=query.getResultList();

        em.getTransaction().commit();
        em.close();
        return result;
    }
}
