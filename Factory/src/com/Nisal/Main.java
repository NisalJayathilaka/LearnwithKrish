package com.Nisal;

public class Main {

    public static void main(String[] args) {
       VehicleFactory vehicleFactory = new VehicleFactory();
       Vehicle vehicle = vehicleFactory.getInstance("Jeep");
       vehicle.park();
    }
}
