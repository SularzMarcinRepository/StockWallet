package org.example.service.newTransaction;

import org.example.entity.Stock;
import org.example.entity.TransactionType;
import org.example.repository.stockCrud.StockCrudMethodsRead;

import java.util.List;
import java.util.Scanner;

public class TransactionStockId {

    public static Stock StockId;
    public static void stockId() {

        if (TransactionBuyOrSell.transactionType== TransactionType.SELL) {
            System.out.println("Podaj ticker akcji jaką sprzedałeś, np CDR");
        } else {
        System.out.println("Podaj ticker akcji jaką zakupiłeś, np CDR");
        }
        Scanner scanner = new Scanner(System.in);
        String ticker = scanner.nextLine();

        List<Stock> list = StockCrudMethodsRead.readAllStock();
        boolean isStockInDataBase = false;
        for (Stock stock : list) {

            if ((stock.getTicker().equals(ticker))) {


                isStockInDataBase = true;
                StockId = stock;
                break;
            }

        }
        if (!isStockInDataBase) {
            System.out.println("niestety nie ma takich akcji w bazie");
        }
    }
}

