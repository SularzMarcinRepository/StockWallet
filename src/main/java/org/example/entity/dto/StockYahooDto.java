package org.example.entity.dto;

public class StockYahooDto {
    private String StockName;
    private Double price;
    private String currency;
    private int stockAmount;

    public StockYahooDto() {
    }

    public StockYahooDto(String stockName, int stockAmount) {
        StockName = stockName;
        this.stockAmount = stockAmount;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String stockName) {
        StockName = stockName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "StockYahooDto{" +
                "StockName='" + StockName + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
