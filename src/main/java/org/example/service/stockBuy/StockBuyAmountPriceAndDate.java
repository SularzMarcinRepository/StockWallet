package org.example.service.stockBuy;

import java.math.BigDecimal;
import java.util.Scanner;

public class StockBuyAmountPriceAndDate {

    public static int stockAmount;
    public static String stockBuyDate;
    public static BigDecimal stockPrice;

    public static void buyAmount() {

        System.out.println("Podaj ile akcji zakupiłeś ");
        Scanner scanner = new Scanner(System.in);
        stockAmount = scanner.nextInt();
    }
    public static void buyPrice() {
        System.out.println("Podaj cene pojedynczej akcji (w razie potrzeby oddziel cześć dziesietną przecinkiem)");
        Scanner scanner2 = new Scanner(System.in);
        stockPrice=scanner2.nextBigDecimal();
    }
    public static void buyDate() {
        System.out.println("Podaj date zakupu w następującej formie: rok-miesiąc-dzień, np. 2023-05-02");
        Scanner scanner3 = new Scanner(System.in);
        stockBuyDate=scanner3.nextLine();

    }

}
