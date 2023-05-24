package org.example.service.usersStock;

import org.example.entity.TransactionType;
import org.example.entity.Transactions;
import org.example.entity.dto.StockYahooDto;
import org.example.repository.transactionsCrud.UsersTransactions;
import org.example.service.LoggingUser;

import java.util.ArrayList;
import java.util.List;

public class UsersStock {
   public static List<StockYahooDto> usersStock = new ArrayList<>();
    public static List<StockYahooDto> usersStock() {

        List<Transactions> result = UsersTransactions.ReadUsersStock(LoggingUser.walletsUserID);
        for (Transactions transactions : result) {
            boolean found = false;
            for (StockYahooDto stockYahooDto : usersStock) {
                if (stockYahooDto.getStockName().equals(transactions.getStockName())) {
                    found = true;
                    if (transactions.getTransactionType() == TransactionType.BUY) {
                        stockYahooDto.setStockAmount(stockYahooDto.getStockAmount() + transactions.getStockAmount());
                    } else if (transactions.getTransactionType() == TransactionType.SELL) {
                        stockYahooDto.setStockAmount(stockYahooDto.getStockAmount() - transactions.getStockAmount());
                    }
                }
            }
            if (!found) {
                StockYahooDto stockYahooDto = new StockYahooDto(transactions.getStockName(), transactions.getStockAmount());
                usersStock.add(stockYahooDto);
            }
        }
        return usersStock;
    }
}