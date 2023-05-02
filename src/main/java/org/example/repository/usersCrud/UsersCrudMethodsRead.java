package org.example.repository.usersCrud;

import jakarta.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.example.entity.Stock;
import org.example.entity.Users;
import org.example.entity.UsersBrokers;
import org.example.service.LoggingUser;

import java.util.List;

public class UsersCrudMethodsRead {

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
    public static void ReadAllUsers(){

        em.getTransaction().begin();
        TypedQuery<Users> query=em.createQuery("select u from Users u", Users.class);
        List<Users> results= query.getResultList();

        for(Users users:results){
            logger.info(users);
        }
        em.getTransaction().commit();
        em.close();
    }
    public static void ReadUsersStock(long id) {

        em.getTransaction().begin();

        TypedQuery<Stock> query= em.createQuery("select u.stock from Users u where u.id=:id", Stock.class);
        query.setParameter("id",id);
        List<Stock>result=query.getResultList();
        for (Stock stock:result){
            logger.info(stock.getName());
        }
        em.getTransaction().commit();
        em.close();
    }
    public static void ReadUsersBrokers(long id) {

        em.getTransaction().begin();

        TypedQuery<UsersBrokers> query= em.createQuery("select u.usersBrokers from Users u where u.id=:id", UsersBrokers.class);
        query.setParameter("id",id);
        List<UsersBrokers>result=query.getResultList();
        for (UsersBrokers usersBrokers:result){
            logger.info(usersBrokers.getName());
        }
        em.getTransaction().commit();
        em.close();
    }
    public static void ReadUserBalance(){


        em.getTransaction().begin();
        Users user= em.find(Users.class,LoggingUser.walletsUserID);

        System.out.println(("Twój balans wynosi:"+ " " + user.getBalance()));


        em.getTransaction().commit();
        em.close();
    }

}
