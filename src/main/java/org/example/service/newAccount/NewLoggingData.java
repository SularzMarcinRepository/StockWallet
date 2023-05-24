package org.example.service.newAccount;

import org.example.controller.LoginToTheApplication;
import org.example.entity.LoggingData;
import org.example.repository.loggingDataCrud.LoggingDataCrudMethodsCreate;
import org.example.repository.loggingDataCrud.LoggingDataCrudMethodsRead;

import java.util.List;
import java.util.Scanner;

public class NewLoggingData {
    public static void createNewLoggingData(){
        System.out.println("Podaj login za pomocą którego będziesz się logował");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Podaj hasło do konta");
        Scanner scanner2 = new Scanner(System.in);
        String password = scanner2.nextLine();

        System.out.println("Podaj ponownie hasło");
        Scanner scanner3 = new Scanner(System.in);
        String passwordAgain = scanner3.nextLine();

        if(password.equals(passwordAgain)) {

            List<LoggingData> list = LoggingDataCrudMethodsRead.ReadAllLoggingData();
            boolean isUserInDataBase = false;
            for (LoggingData loggingData : list) {

                if ((loggingData.getLogin().equals(login))) {

                    System.out.println("Użytkownik o podanym loginie już jest w bazie danych");
                    isUserInDataBase = true;
                    LoginToTheApplication.loginToTheApplication();
                    break;
                }

            }
            if (!isUserInDataBase) {
                LoggingData newLoggingData=LoggingDataCrudMethodsCreate.createLoggingData(login,password);
                System.out.println("Pomyślnie utworzono nowe konto. W celu ukończenia tworzenia Twoje portfela, będziesz musiał podac jeszcze kilka danych.");
                NewUserData.newUserData(newLoggingData);
            }
        } else {
            System.out.println("błędnie powtórzyłes hasło");
            LoginToTheApplication.loginToTheApplication();
        }



    }
}
