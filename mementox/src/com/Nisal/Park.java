package com.Nisal;

import java.util.ArrayList;

//originator
public class Park {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return (ArrayList<Vehicle>) vehicles.clone();
    }

    public ParkMemento save()
    {
        return new ParkMemento(getVehicles());
    }

    public void revert(ParkMemento parkMemento)
    {
        vehicles = parkMemento.getVehicles();
    }
    @Override
    public String toString() {
        return "Park{" +
                "vehicles=" + vehicles +
                '}';
    }

    static class ParkMemento
    {
        ArrayList<Vehicle> vehicles;

        public ParkMemento(ArrayList<Vehicle> vehicles) {
            this.vehicles = vehicles;
        }

        private ArrayList<Vehicle> getVehicles() {
            return vehicles;
        }
    }

}
