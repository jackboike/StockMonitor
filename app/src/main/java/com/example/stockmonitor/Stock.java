package com.example.stockmonitor;

public class Stock {

    /** Stock price */
    private double price;
    /** Stock's fiveYearMax */
    private double fiveYearMax;
    /** Stock name */
    private String name;
    /** Stock's ticker on its exchange */
    private String ticker;
    /** Date of the stock price */
    private String date;
    /** True means stock is up or flat, False means stock is down */
    private boolean status;

    /**
     * Creates an instance of a Stock class
     * @param price stock price
     * @param fiveYearMax five year max
     * @param name Stock name
     * @param ticker Stock ticker
     */
    public Stock(double price, double fiveYearMax, String name, String ticker, String date, boolean status) {
        this.price = price;
        this.fiveYearMax = fiveYearMax;
        this.name = name;
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.00) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.price = price;
    }

    public double getFiveYearMax() {
        return fiveYearMax;
    }

    public void setFiveYearMax(double fiveYearMax) {
        this.fiveYearMax = fiveYearMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        if (ticker == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.ticker = ticker;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (name == null) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void checkStockStatus(Stock current) {
        Stock yesterday = new Stock(getPreviousPrice(date - 1), double fiveYearMax, name, ticker, date, boolean status);
        if (current.getPrice() >= yesterday.getPrice()) {
            current.setStatus(true);
        } else {
            current.setStatus(false);
        }
    }




}
