package org.example.service.newTransaction;

import org.example.entity.TransactionType;

import java.math.BigDecimal;
import java.util.Scanner;

public class TransactionAmountPriceAndDate {

    public static int stockAmount;
    public static String transactionDate;
    public static BigDecimal stockPrice;

    public static void transactionStockAmount() {
        if (TransactionBuyOrSell.transactionType== TransactionType.SELL) {
            System.out.println("Podaj ile akcji sprzedałeś: ");
        } else {
            System.out.println("Podaj ile akcji zakupiłeś: ");
        }
        Scanner scanner = new Scanner(System.in);
        stockAmount = scanner.nextInt();
    }
    public static void transactionStockPrice() {
        System.out.println("Podaj cene pojedynczej akcji (w razie potrzeby oddziel cześć dziesietną przecinkiem)");
        Scanner scanner2 = new Scanner(System.in);
        stockPrice=scanner2.nextBigDecimal();
    }
    public static void transactionStockDate() {
        System.out.println("Podaj date transakcji w następującej formie: rok-miesiąc-dzień, np. 2023-05-02");
        Scanner scanner3 = new Scanner(System.in);
        transactionDate =scanner3.nextLine();

    }

}
