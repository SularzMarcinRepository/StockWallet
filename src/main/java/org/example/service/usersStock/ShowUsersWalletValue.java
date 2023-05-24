package org.example.service.usersStock;

import org.example.entity.dto.StockYahooDto;
import org.example.repository.YahooFinanceApi.StockInformation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ShowUsersWalletValue {
    public static BigDecimal showUsersWalletValue() {
        BigDecimal balance = BigDecimal.ZERO;


        List<StockYahooDto> usersStock = UsersStock.usersStock();
        for (StockYahooDto stockYahooDto : usersStock) {
            try {
                BigDecimal stockAmount = new BigDecimal(stockYahooDto.getStockAmount());
                BigDecimal stockPrice = new BigDecimal(StockInformation.getStockInformation(stockYahooDto.getStockName()).getPrice());
                BigDecimal stockValue = stockAmount.multiply(stockPrice);
                balance = balance.add(stockValue);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        balance = balance.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Wartość Twoich aktywów wynosi:"+ " " + balance + " " + "USD");
        return balance;


    }
}

