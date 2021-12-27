package com.Nisal;

public class SingleTonDoubleCheckLockingInstance {

    private static SingleTonDoubleCheckLockingInstance singleTonDoubleCheckLockingInstance = null;

    private SingleTonDoubleCheckLockingInstance ()
    {
        System.out.println(" hello world");
    }

    public static SingleTonDoubleCheckLockingInstance getSingleTonDoubleCheckLockingInstance()
    {
        if(singleTonDoubleCheckLockingInstance == null)
        {
            synchronized (SingleTonDoubleCheckLockingInstance.class) // synchronized with the class
            {
                if(singleTonDoubleCheckLockingInstance == null)
                {
                    singleTonDoubleCheckLockingInstance = new SingleTonDoubleCheckLockingInstance();
                }
            }
        }
        return singleTonDoubleCheckLockingInstance;
    }

}
