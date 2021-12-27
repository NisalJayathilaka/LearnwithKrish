package com.Nisal;

public class VehicleParking {

    private boolean empty;

    private static VehicleParking vehicleParking;

    private VehicleParking()
    {
        empty =true;
    }

    public static VehicleParking getVehicleParking()
    {
        if(vehicleParking == null)
        {
            synchronized (VehicleParking.class) // synchronized with the class
            {
                if(vehicleParking == null)
                {
                    vehicleParking = new VehicleParking();
                }
            }
        }
        return vehicleParking;
    }

    public void vehicleFull()
    {
        empty = false;
    }

    public boolean isEmpty()
    {
        return empty;
    }
}
