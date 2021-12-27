package com.Nisal;

public class NotaVehicle implements Vehicle{

    @Override
    public void park() {
        System.out.println("That 's not type of vehicle to park");
    }
}
