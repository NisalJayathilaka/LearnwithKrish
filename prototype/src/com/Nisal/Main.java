package com.Nisal;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.setVehicleFactoryName("India");
        vehicleFactory.createSample();
        System.out.println(vehicleFactory);


        // Deep cloning
      VehicleFactory vehicleFactory1 = vehicleFactory.clone();
      vehicleFactory1.setVehicleFactoryName("China");
      System.out.println(vehicleFactory1);


    }
}
    // shallow cloning
//    VehicleFactory vehicleFactory1 = (VehicleFactory) vehicleFactory.clone();
//        vehicleFactory1.setVehicleFactoryName("China");
//                System.out.println(vehicleFactory1);

