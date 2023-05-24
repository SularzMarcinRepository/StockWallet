package org.example.service.usersStock;

import org.example.entity.dto.StockYahooDto;

import java.util.List;

public class ShowUsersStock {
    public static void showUsersStock() {

        List<StockYahooDto> usersStock = UsersStock.usersStock();


        for (StockYahooDto stockYahooDto : usersStock) {
            System.out.println("Nazwa akcji: " + stockYahooDto.getStockName() + " " + "ilość akcji w portfelu: " + stockYahooDto.getStockAmount());
        }
    }
}
