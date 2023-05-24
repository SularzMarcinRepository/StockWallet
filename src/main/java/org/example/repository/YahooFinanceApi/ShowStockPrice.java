package org.example.repository.YahooFinanceApi;

import org.example.entity.dto.StockYahooDto;

import java.util.Scanner;

public class ShowStockPrice {
    public static void showStockPrice(){

        System.out.println("Podaj ticer akcji, której cene chcesz sprawdzić");

        Scanner scanner = new Scanner(System.in);
        String stockTicker= scanner.nextLine();

        try {
            StockYahooDto stockYahooDtoDTO = StockInformation.getStockInformation(stockTicker);
            System.out.println("Aktualna cena akcji" + " " + stockYahooDtoDTO.getStockName()+ " "+ "wynosi"+  " "+ stockYahooDtoDTO.getPrice() + " " + "USD");
        }catch (Exception e){
            System.out.println("Nie ma akcji o podanej nazwie");
        }
    }
}
