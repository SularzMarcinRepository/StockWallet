package org.example.service.newTransaction;

import org.example.entity.TransactionType;

import java.util.Scanner;

public class TransactionBuyOrSell {
    public static TransactionType transactionType;

    public static void transactionType() {


        System.out.println("1. Chce dodać transakcje zakupu akcji- wpisz 1 ");
        System.out.println("2. Chce dodać transakcje sprzedaży akcji- wpisz 2 ");

        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        if (type==1) {
            transactionType = TransactionType.BUY;
        }  else if (type==2) {
            transactionType = TransactionType.SELL;
        } else {
            System.out.println("podałeś niepoprawną cyfre");         

        }

    }
}