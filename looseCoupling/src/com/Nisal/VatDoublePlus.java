package com.Nisal;

public class VatDoublePlus extends Handler{

    @Override
    public double applyTax(VehiclePrices vehiclePrices) {
        vehiclePrices.setTax( vehiclePrices.getTax() + vehiclePrices.getPrice() * 0.04);
        System.out.println("VAT double calculated");
        return vehiclePrices.getTax();

    }
}
