package com.Nisal;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory implements Cloneable{
    //Cloneable is maker interface because it doesn't have any methods.

    private String vehicleFactoryName;

    List<Vehicle> vehicleList = new ArrayList<>();


    public String getVehicleFactoryName() {
        return vehicleFactoryName;
    }

    public void setVehicleFactoryName(String vehicleFactoryName) {
        this.vehicleFactoryName = vehicleFactoryName;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void createSample()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName("Toyota");
        vehicle.setPrice(1200);
        getVehicleList().add(vehicle);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setBrandName("Benz");
        vehicle1.setPrice(6000);
        getVehicleList().add(vehicle1);
    }

    @Override
    public String toString() {
        return "VehicleFactory{" +
                "vehicleFactoryName='" + vehicleFactoryName + '\'' +
                ", vehicleList=" + vehicleList +
                '}';
    }


    // Deep cloning we create two objects then one will not affect to the other
    @Override
    protected VehicleFactory clone() throws CloneNotSupportedException
    {
        VehicleFactory vehicleFactory= new VehicleFactory();
        for(Vehicle vehicle: this.getVehicleList())
        {
            vehicleFactory.getVehicleList().add(vehicle);
        }
        return vehicleFactory;
    }

}

    //shallow cloning
    //It does not give any impact here because it copies the first level object to the new reference
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }