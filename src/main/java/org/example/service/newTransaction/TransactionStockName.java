package org.example.service.newTransaction;

import org.example.entity.TransactionType;
import org.example.entity.dto.StockYahooDto;
import org.example.repository.YahooFinanceApi.StockInformation;

import java.util.Scanner;

public class TransactionStockName {
    public static String stockName;

    public static void transactionStockName() {
        if (TransactionBuyOrSell.transactionType == TransactionType.SELL) {
            System.out.println("Podaj ticker akcji jaką sprzedałeś, np CDR");
        } else {
            System.out.println("Podaj ticker akcji jaką zakupiłeś, np CDR");
        }
        Scanner scanner = new Scanner(System.in);
        String ticker = scanner.nextLine();

        try {
            StockYahooDto stockYahooDto = StockInformation.getStockInformation(ticker);
            stockName=stockYahooDto.getStockName();
        } catch (Exception e) {
            System.out.println("Podałeś nieprawidłową nazwe akcji");
            System.exit(0);

        }
    }
}
