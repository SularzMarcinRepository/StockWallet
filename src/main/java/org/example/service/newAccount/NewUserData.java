package org.example.service.newAccount;

import org.example.entity.LoggingData;
import org.example.repository.usersCrud.UsersCrudMethodsCreate;

import java.util.Scanner;

public class NewUserData {


    public static void newUserData(LoggingData loggingData) {

        System.out.println("Podaj swoje imie");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko");
        Scanner scanner2 = new Scanner(System.in);
        String surname = scanner2.nextLine();

        UsersCrudMethodsCreate.createUserWithData(name,surname,loggingData);
    }
}