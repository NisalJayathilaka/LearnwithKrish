package com.Nisal;

public class Main {

    public static void main(String[] args) {

        Vat vat = new Vat();
        VatPlus vatPlus = new VatPlus();
        VatDoublePlus vatDoublePlus = new VatDoublePlus();
        Tax tax = new Tax();

        tax.setSuccessor(vat);
        vat.setSuccessor(vatPlus);
        vatPlus.setSuccessor(vatDoublePlus);

        VehiclePrices vehiclePrices = new VehiclePrices(60000);
        System.out.println(tax.applyTax(vehiclePrices));

        VehiclePrices vehiclePrices1 = new VehiclePrices(40000);
        System.out.println(tax.applyTax(vehiclePrices1));

    }
}
