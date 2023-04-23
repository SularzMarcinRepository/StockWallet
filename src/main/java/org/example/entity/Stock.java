package org.example.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int price;

    @Column(name = "numer_of_stock_shares")
    private int numberOfStockShares;
    @Enumerated(EnumType.STRING)
    private Industry industry;
    @ManyToMany(mappedBy = "stock",fetch = FetchType.LAZY)
    private Set<Users>users=new HashSet<>();

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }

    public Stock() {
    }

    public long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfStockShares() {
        return numberOfStockShares;
    }

    public void setNumberOfStockShares(int numberOfStockShares) {
        this.numberOfStockShares = numberOfStockShares;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", numberOfStockShares=" + numberOfStockShares +
                ", industry=" + industry +
                ", users=" + users +
                '}';
    }
}
