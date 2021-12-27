package com.Nisal;

public class Vat extends Handler{

    @Override
    public double applyTax(VehiclePrices vehiclePrices) {
       vehiclePrices.setTax( vehiclePrices.getTax() + vehiclePrices.getPrice() * 0.02);
        System.out.println("VAT calculated");

        if(vehiclePrices.getPrice() < 50000)
        {
            return vehiclePrices.getTax();
        }
        else {
            return successor.applyTax(vehiclePrices);
        }
    }
}
