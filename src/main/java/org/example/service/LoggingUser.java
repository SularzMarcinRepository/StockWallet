package org.example.service;

import org.example.controller.LoginToTheApplication;
import org.example.entity.LoggingData;
import org.example.entity.Users;
import org.example.repository.loggingDataCrud.LoggingDataCrudMethodsRead;

import java.util.List;
import java.util.Scanner;

public class LoggingUser {
public static Users walletsUserID;

    public static void getLoggingDataWithPassword() {
        System.out.println("Podaj swój login:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Podaj swóje hasło:");
        Scanner scanner2 = new Scanner(System.in);
        String password = scanner.nextLine();

        List<LoggingData> list = LoggingDataCrudMethodsRead.ReadAllLoggingData();
        boolean isUserInDataBase = false;
        for (LoggingData loggingData : list) {

            if ((loggingData.getLogin().equals(login)) && (loggingData.getPassword().equals(password))) {

                System.out.println("podałeś poprawne dane, witamy w aplikacji");
                isUserInDataBase = true;
                walletsUserID= loggingData.getUsers();
                break;
            }

        }
        if (!isUserInDataBase) {
            System.out.println("podałeś błędne dane");
            LoginToTheApplication.loginToTheApplication();
        }
    }
}
