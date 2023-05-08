package org.example.entity.dto;

public class StockDto {
    private String name;
    private int stockAmount;

    public StockDto(String name, int stockAmount) {
        this.name = name;
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    @Override
    public String toString() {
        return "StockDto{" +
                "name='" + name + '\'' +
                ", stockAmount=" + stockAmount +
                '}';
    }
}
