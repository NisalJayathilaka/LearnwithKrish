package com.Nisal;

public class VatPlus extends Handler{
    @Override
    public double applyTax(VehiclePrices vehiclePrices) {
        vehiclePrices.setTax( vehiclePrices.getTax() + vehiclePrices.getPrice() * 0.03);
        System.out.println("VAT plus calculated");

        if(vehiclePrices.getPrice() > 50000 && vehiclePrices.getPrice() <= 100000)
        {
            return vehiclePrices.getTax();
        }
        else {
            return successor.applyTax(vehiclePrices);
        }
    }
}
