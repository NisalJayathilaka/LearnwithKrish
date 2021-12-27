package com.Nisal;

public class SingleTonEarlyInstance {

    private static final SingleTonEarlyInstance singleTonEasyInstance = new SingleTonEarlyInstance();
    // The object should be static because the getInstance() is static within the getInstance we return the
    // static object

    private SingleTonEarlyInstance()
    {
        // private constructor is used to prevent to create the objects.
    }

    public static SingleTonEarlyInstance getInstance()
    {
        return singleTonEasyInstance;
    }

    public void doSomething()
    {
        System.out.println("hello world");
    }

}

