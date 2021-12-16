package com.example.f21comp1011gcfinalb;

import com.google.gson.annotations.SerializedName;

public class Dealership {
    @SerializedName("Dealer")
    private String dealer;

    @SerializedName("CarsReturned")
    private int carsReturned;

    @SerializedName("Stock")
    private Car[] stock;

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public int getCarsReturned() {
        return carsReturned;
    }

    public void setCarsReturned(int carsReturned) {
        this.carsReturned = carsReturned;
    }

    public Car[] getStock() {
        return stock;
    }

    public void setStock(Car[] stock) {
        this.stock = stock;
    }
}
