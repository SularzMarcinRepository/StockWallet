package org.example.controller;

import org.example.service.LoggingUser;
import org.example.service.stockBuy.StockBuyAmountPriceAndDate;
import org.example.service.stockBuy.StockBuyId;
import org.example.service.stockBuy.StockBuyMethod;

public class WalletFrontEnd {
    public static void main(String[] args) {
        System.out.println("Witaj w aplikiacji My Winning Wallet!");
        System.out.println("Podaj swoje dane do logowania:");

        LoggingUser.getLoggingDataWithPassword();
//        System.out.println("W czym moge Ci pomóc?\nWybierz jedną z następujących opcji: ");
//        System.out.println("1. Chce zobaczyć swój bilans ");
//        System.out.println("2. Chce zobaczyć swoje aktywa ");
//        System.out.println("3. Chce zmienić swój login ");
//        UsersCrudMethodsRead.ReadUserBalance();
        StockBuyId.stockId();
        StockBuyAmountPriceAndDate.buyAmount();
        StockBuyAmountPriceAndDate.buyPrice();
        StockBuyAmountPriceAndDate.buyDate();
        StockBuyMethod.newBuyTransaction();

    }
}