package org.example.entity.dto;

public class StockYahooDto {
    private String StockName;
    private Double price;
    private String currency;

    public StockYahooDto() {
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
