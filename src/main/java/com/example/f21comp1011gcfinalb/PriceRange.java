package com.example.f21comp1011gcfinalb;

public class PriceRange {
    private int min;
    private int max;

    public PriceRange(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(min > 0){
            this.min = min;
        }
        else{
            throw new IllegalArgumentException("Minimum must be greater than 0");
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        if(max > min){
            this.max = max;
        }
        else{
            throw new IllegalArgumentException("Maximum must be greater than minimum price");
        }
    }


    public String toString(){
        return String.format("$%d to $%d", min, max);
    }
}
