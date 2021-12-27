package com.Nisal;

public class Main {
    public static void main(String[] args) {

        SingleTonLazyInstance na = SingleTonLazyInstance.getSingleTonLazyInstance();
       /* SingleTonEarlyInstance na =new SingleTonEarlyInstance(); don't use that
          because you are using private constructor
        */
        na.doSomething();

    }
}



//    SingleTonEarlyInstance na = SingleTonEarlyInstance.getInstance();
//       /* SingleTonEarlyInstance na =new SingleTonEarlyInstance(); don't use that
//          because you are using private constructor
//        */
//        na.doSomething();

//
//                SingleTonDoubleCheckLockingInstance nc = SingleTonDoubleCheckLockingInstance.getSingleTonDoubleCheckLockingInstance();
//                nc.doSomething();



////

//    Thread thread = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            SingleTonDoubleCheckLockingInstance nc = SingleTonDoubleCheckLockingInstance.getSingleTonDoubleCheckLockingInstance();
//        }
//    });
//
//    Thread thread1 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            SingleTonDoubleCheckLockingInstance nd = SingleTonDoubleCheckLockingInstance.getSingleTonDoubleCheckLockingInstance();
//        }
//    });
//
//           thread.start();
//                   thread1.start();