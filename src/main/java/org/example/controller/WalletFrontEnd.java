package org.example.controller;

import org.example.service.LoggingUser;

public class WalletFrontEnd {
    public static void main(String[] args) {
        System.out.println("Witaj w aplikiacji My Winning Wallet!");
        System.out.println("Podaj swoje dane do logowania:");

//        System.out.println("Podaj swój login:");
//        LoggingUser.getLoggingData();
//        System.out.println("Podaj swóje hasło:");
        LoggingUser.getLoggingDataWithPassword();
//        System.out.println("W czym moge Ci pomóc?\nWybierz jedną z następujących opcji: ");
//        System.out.println("1. Chce zobaczyć swój bilans ");
//        System.out.println("2. Chce zobaczyć swoje aktywa ");
//        System.out.println("3. Chce zmienić swój login ");



    }
}