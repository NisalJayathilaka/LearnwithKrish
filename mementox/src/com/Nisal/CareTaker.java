package com.Nisal;

import java.util.Stack;

public class CareTaker {

    Stack<Park.ParkMemento> history = new Stack<>();

    public void save(Park park)
    {
        history.push(park.save());
    }

    public void revert(Park park)
    {
        if(!history.isEmpty())
        {
            park.revert(history.pop());
        }
        else
        {
            System.out.println("cant undo");
        }
    }
}
