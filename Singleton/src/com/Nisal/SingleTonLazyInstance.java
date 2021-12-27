package com.Nisal;

public class SingleTonLazyInstance {

    private static SingleTonLazyInstance singleTonLazyInstance;

    private SingleTonLazyInstance()
    {
        System.out.println(" hello world ");
    }

    public static SingleTonLazyInstance getSingleTonLazyInstance()
    {
        if(singleTonLazyInstance == null)
        {
            singleTonLazyInstance = new SingleTonLazyInstance();

            // In here we add the if statement because of when we create
            // SingleTonLazyInstance nb = SingleTonLazyInstance.getSingleTonLazyInstance();
            // It means two object now it will call the getSingleTonLazyInstance() twice that means
            // it will create two objects. So we loose the singleton
            // if you have doubt check the code without if statement
        }
        return singleTonLazyInstance;
    }

    public void doSomething()
    {
        System.out.println("hello world");
    }
}
