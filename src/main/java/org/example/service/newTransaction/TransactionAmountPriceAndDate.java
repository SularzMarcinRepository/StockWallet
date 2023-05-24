package org.example.service.newTransaction;

import org.example.controller.MainFunctions;
import org.example.entity.TransactionType;
import org.example.entity.dto.StockYahooDto;
import org.example.service.usersStock.UsersStock;

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
        if(TransactionBuyOrSell.transactionType== TransactionType.SELL){
            for(StockYahooDto stockYahooDto : UsersStock.usersStock()){
                if(stockYahooDto.getStockName().equals(TransactionStockName.stockName) && (stockYahooDto.getStockAmount()<stockAmount)){
                    System.out.println("nie masz wystarczającej ilości akcji.");
                    System.out.println("W portfelu masz" + " "  + stockYahooDto.getStockAmount() + " " +"akcji spółki "+ stockYahooDto.getStockName());
                    MainFunctions.mainFunctions();

                }
            }

        }
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
