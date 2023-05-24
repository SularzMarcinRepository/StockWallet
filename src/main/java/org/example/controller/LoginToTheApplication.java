package org.example.controller;

import org.example.service.LoggingUser;
import org.example.service.newAccount.NewLoggingData;
import org.example.service.newAccount.NewUserData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginToTheApplication {
    public static void loginToTheApplication(){
        System.out.println("Witaj w aplikiacji My Winning Wallet!");
        System.out.println("Wybierz prosze jedną z następujących opcji:");
        System.out.println("1. Jeśli masz juz konto i chcesz sie zalogować");
        System.out.println("2. Jeśli nie ma jeszcze konta i chcesz założyć nowe");
        System.out.println("0. Jeśli chcesz wyjść z aplikacji");

        try {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    LoggingUser.getLoggingDataWithPassword();
                    MainFunctions.mainFunctions();
                }
                case 2 -> {
                    NewLoggingData.createNewLoggingData();
                    LoggingUser.getLoggingDataWithPassword();
                    MainFunctions.mainFunctions();
                }
                case 0 -> {
                    System.out.println("Do zobaczenia!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Podałeś niepoprawną opcje.");
                    LoginToTheApplication.loginToTheApplication();
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("podałeś niepoprawną opcje");
            LoginToTheApplication.loginToTheApplication();

        }

    }
}
