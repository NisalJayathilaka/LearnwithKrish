package com.Nisal;

public class VehiclePrices {

    private double price;
    private double tax;

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public VehiclePrices(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }
}
