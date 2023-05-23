package org.example.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal price;
    private String ticker;

    @Column(name = "numer_of_stock_shares")
    private int numberOfStockShares;
    @Enumerated(EnumType.STRING)
    private Industry industry;





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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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





    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", numberOfStockShares=" + numberOfStockShares +
                ", industry=" + industry +

                '}';
    }
}
