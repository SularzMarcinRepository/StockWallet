package org.example.service;

import org.example.entity.LoggingData;
import org.example.repository.LoggingDataCrud.LoggingDataCrudMethodsRead;

import java.util.List;
import java.util.Scanner;

public class LoggingUser {


    public static void getLoggingDataWithPassword() {
        System.out.println("Podaj swój login:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Podaj swóje hasło:");
        Scanner scanner2 = new Scanner(System.in);
        String password = scanner.nextLine();

        List<LoggingData> list = LoggingDataCrudMethodsRead.ReadAllLoggingData();
        boolean isUserinDataBase = false;
        for (LoggingData loggingData : list) {

            if ((loggingData.getLogin().equals(login)) && (loggingData.getPassword().equals(password))) {

                System.out.println("podałeś poprawne dane");
                isUserinDataBase = true;
                break;
            }

        }
        if (!isUserinDataBase) {
            System.out.println("podałeś błędne dane");
        }
    }
}
