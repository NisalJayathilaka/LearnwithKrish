package com.Nisal;

public class Vehicle {

    private String brandName;
    private int price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
