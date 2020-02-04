import com.example.stockmonitor.Stock;

import java.util.ArrayList;

public class Portfolio {
    /** Stocks in someone's portfolio */
    private ArrayList<Stock> stocks;

    public Portfolio(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public void addStock(Stock stock) {
        if (stock == null) {
            throw new IllegalArgumentException("Invalid stock");
        }

        stocks.add(stocks.size(), stock);
    }

}
