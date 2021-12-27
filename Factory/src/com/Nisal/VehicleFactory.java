package com.Nisal;

public class VehicleFactory {

    public Vehicle getInstance(String vehicleType)
    {
        if(vehicleType.equals("Car"))
        return new Car();
        else if(vehicleType.equals("Van"))
            return new Van();
        else if(vehicleType.equals("Jeep"))
            return new Jeep();
        else
            return new NotaVehicle();
    }
}
