package org.example.controller;

import org.example.repository.YahooFinanceApi.ShowStockPrice;
import org.example.service.newTransaction.NewTransaction;
import org.example.service.newTransaction.TransactionAmountPriceAndDate;
import org.example.service.newTransaction.TransactionBuyOrSell;
import org.example.service.newTransaction.TransactionStockName;
import org.example.service.usersStock.ShowUsersWalletValue;
import org.example.service.usersStock.ShowUsersStock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFunctions {
    public static void mainFunctions(){
        System.out.println("Co chciałbyś zrobić? Podaj proszę odpowiednią cyfrę:");
        System.out.println("1. Dodaj nową transakcję");
        System.out.println("2. Sprawdz wartość swoich aktywów");
        System.out.println("3. Sprawdz swoje aktywa");
        System.out.println("4. Sprawdz aktualną cene akcji");
        System.out.println("0. Wyjdz z aplikacji");

        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            switch (choice) {
                case 1 -> {
                    TransactionBuyOrSell.transactionType();
                    TransactionStockName.transactionStockName();
                    TransactionAmountPriceAndDate.transactionStockAmount();
                    TransactionAmountPriceAndDate.transactionStockPrice();
                    TransactionAmountPriceAndDate.transactionStockDate();
                    NewTransaction.newTransaction();

                    MainFunctions.mainFunctions();
                }
                case 2 -> {
                    ShowUsersWalletValue.showUsersWalletValue();

                    MainFunctions.mainFunctions();

                }
                case 3 -> {
                    ShowUsersStock.showUsersStock();

                    MainFunctions.mainFunctions();

                }
                case 4 -> {
                    ShowStockPrice.showStockPrice();

                    MainFunctions.mainFunctions();
                }
                case 0 -> {
                    System.out.println("Do zobaczenia!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Podałeś niepoprawną opcje.");
                    MainFunctions.mainFunctions();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("podałeś niepoprawną opcje");
            MainFunctions.mainFunctions();
        }

    }


}
