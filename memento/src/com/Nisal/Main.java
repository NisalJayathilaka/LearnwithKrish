package com.Nisal;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Car");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Van");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Jeep");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Truck");
        careTaker.add(originator.saveStateToMemento());


        System.out.println("Last Vehicle " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First vehicle saved " +originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second vehicle saved  " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third vehicle saved  " + originator.getState());



    }
}
