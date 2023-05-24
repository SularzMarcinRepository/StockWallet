package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.*;
import org.example.repository.YahooFinanceApi.ShowStockPrice;
import org.example.repository.stockCrud.StockCrudMethodsRead;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {



    public static void main(String[] args) {
        ShowStockPrice.showStockPrice();






    }
}
