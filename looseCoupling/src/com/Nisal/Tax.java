package com.Nisal;

public class Tax extends Handler{
    @Override
    public double applyTax(VehiclePrices vehiclePrices) {
        return successor.applyTax(vehiclePrices);
    }
}
