package org.example.repository.YahooFinanceApi;

import org.example.entity.dto.StockYahooDto;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StockInformation {
    public static StockYahooDto getStockInformation(String symbol) throws Exception {
        StockYahooDto stockYahooDtoDTO = new StockYahooDto();
        String apiUrl = "https://query1.finance.yahoo.com/v8/finance/chart/" + symbol + "?interval=1d";

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Odpowiedź jest poprawna, sprawdzamy, czy akcja istnieje
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String jsonResponse = response.toString();

            // Sprawdzamy, czy odpowiedź zawiera dane dotyczące akcji
            JSONObject jsonObject = new JSONObject(jsonResponse);
            JSONObject chartObject = jsonObject.getJSONObject("chart");

            if (chartObject.has("result")) {
                JSONObject resultObject = chartObject.getJSONArray("result").getJSONObject(0);
                JSONObject metaObject = resultObject.getJSONObject("meta");
                stockYahooDtoDTO.setStockName(metaObject.getString("symbol"));
                stockYahooDtoDTO.setCurrency(metaObject.getString("currency"));
                stockYahooDtoDTO.setPrice(metaObject.getDouble("regularMarketPrice"));


            }

            return stockYahooDtoDTO;
        }


        // Akcja nie istnieje lub błąd połączenia
        return null;
    }



}
