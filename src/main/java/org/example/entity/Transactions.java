package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "stock_amount")
    private int stockamount;
    @Column(name = "local_date")
    private LocalDate localDate;


}
