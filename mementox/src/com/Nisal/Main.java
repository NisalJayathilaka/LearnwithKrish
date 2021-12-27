package com.Nisal;

public class Main {

    public static void main(String[] args) {


        CareTaker careTaker = new CareTaker();
        Park park = new Park();

        park.addVehicle(new Vehicle("jeep"));
        careTaker.save(park);
        System.out.println(park);
        park.addVehicle(new Vehicle("car"));
        careTaker.save(park);
        System.out.println(park);
        park.addVehicle(new Vehicle("van"));
        careTaker.save(park);
        System.out.println(park);
        park.addVehicle(new Vehicle("bus"));
        careTaker.save(park);
        System.out.println(park);

        careTaker.revert(park);
        System.out.println(park);

        careTaker.revert(park);
        System.out.println(park);
        careTaker.revert(park);
        System.out.println(park);

    }
}
