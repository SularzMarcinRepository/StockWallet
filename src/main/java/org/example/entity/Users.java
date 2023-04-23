package org.example.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "logging_data_id")
    private LoggingData loggingData;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "users_id")},
            inverseJoinColumns = {@JoinColumn(name = "stock_id")}

            )
    private Set<Stock> stock = new HashSet<>();

    @OneToMany(mappedBy = "users")
    private Set<UsersBrokers> usersBrokers = new HashSet<>();

    public Users() {
    }
    public void addUsersBrokers (UsersBrokers usersBrokers){
        this.usersBrokers.add(usersBrokers);
        usersBrokers.setUsers(this);
    }
    public void addStock (Stock stock){
        this.stock.add(stock);
        stock.getUsers().add(this);

    }

    public Set<UsersBrokers> getUsersBrokers() {
        return usersBrokers;
    }

    public void setUsersBrokers(Set<UsersBrokers> usersBrokers) {
        this.usersBrokers = usersBrokers;
    }


    public long getId() {
        return id;
    }

    public LoggingData getLoggingData() {
        return loggingData;
    }

    public void setLoggingData(LoggingData loggingData) {
        this.loggingData = loggingData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Stock> getStock() {
        return stock;
    }

    public void setStock(Set<Stock> stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +

                '}';
    }
}
