package org.example.service.usersStock;

import org.example.entity.TransactionType;
import org.example.entity.Transactions;
import org.example.entity.dto.StockDto;
import org.example.repository.transactionsCrud.UsersTransactions;
import org.example.service.LoggingUser;

import java.util.ArrayList;
import java.util.List;

public class ShowUsersStock {
    public static void showUsersStock(){
        List<StockDto>usersStock= new ArrayList<>();
        List<Transactions> result = UsersTransactions.ReadUsersStock(LoggingUser.walletsUserID);
        for (Transactions transactions : result) {
            boolean found = false;
            for (StockDto stockDto : usersStock) {
                if (stockDto.getName().equals(transactions.getStock().getName())) {
                    found = true;
                    if (transactions.getTransactionType() == TransactionType.BUY) {
                        stockDto.setStockAmount(stockDto.getStockAmount() + transactions.getStockAmount());
                    } else if (transactions.getTransactionType() == TransactionType.SELL) {
                        stockDto.setStockAmount(stockDto.getStockAmount() - transactions.getStockAmount());
                    }
                }
            }
            if (!found) {
                StockDto stockDto = new StockDto(transactions.getStock().getName(), transactions.getStockAmount());
                usersStock.add(stockDto);
            }
        }
        for (StockDto stockDto:usersStock){
            System.out.println("Nazwa akcji: " + stockDto.getName() + " "+ "ilość akcji w portfelu: " + stockDto.getStockAmount() );
        }





    }

}
