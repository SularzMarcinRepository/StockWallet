package org.example.service.stockBuy;

import org.example.entity.Stock;
import org.example.repository.stockCrud.StockCrudMethodsRead;

import java.util.List;
import java.util.Scanner;

public class StockBuyId {

    public static Stock buyStockId;
    public static void stockId() {
        System.out.println("Podaj ticker akcji jaką zakupiłeś, np CDR");
        Scanner scanner = new Scanner(System.in);
        String ticker = scanner.nextLine();

        List<Stock> list = StockCrudMethodsRead.readAllStock();
        boolean isStockInDataBase = false;
        for (Stock stock : list) {

            if ((stock.getTicker().equals(ticker))) {


                isStockInDataBase = true;
                buyStockId= stock;
                break;
            }

        }
        if (!isStockInDataBase) {
            System.out.println("niestety nie ma takich akcji w bazie");
        }
    }
}

