package org.example.controller;

import org.example.repository.stockCrud.StockCrudMethodsRead;
import org.example.repository.transactionsCrud.UsersTransactions;
import org.example.service.LoggingUser;
import org.example.service.newTransaction.NewTransaction;
import org.example.service.newTransaction.TransactionAmountPriceAndDate;
import org.example.service.newTransaction.TransactionBuyOrSell;
import org.example.service.newTransaction.TransactionStockName;
import org.example.service.usersStock.ShowUsersBalance;
import org.example.service.usersStock.ShowUsersStock;
import org.example.service.usersStock.UsersStock;

public class WalletFrontEnd {
    public static void main(String[] args) {
//        System.out.println("Witaj w aplikiacji My Winning Wallet!");
//        System.out.println("Podaj swoje dane do logowania:");
//
//        LoggingUser.getLoggingDataWithPassword();
//        LoggingUser.getLoggingDataWithPassword();
////        System.out.println("W czym moge Ci pomóc?\nWybierz jedną z następujących opcji: ");
////        System.out.println("1. Chce dodać transakcje do portfela: ");
////
////
//        TransactionBuyOrSell.transactionType();
//        TransactionStockName.transactionStockName();
//        TransactionAmountPriceAndDate.transactionStockAmount();
//        TransactionAmountPriceAndDate.transactionStockPrice();
//        TransactionAmountPriceAndDate.transactionStockDate();
//        NewTransaction.newTransaction();
////        NewLoggingData.createNewLoggingData();
////        ShowUsersStock.showUsersStock();
//        ShowUsersStock.showUsersStock();
////        ShowUsersBalance.showUsersBalance();
//        System.out.println(ShowUsersBalance.showUsersBalance());
//        LoggingUser.getLoggingDataWithPassword();

        StockCrudMethodsRead.readAllStock();
        StockCrudMethodsRead.readAllStock();
    }
}