package com.itcast.thread.thread01;

public class MyThread extends Thread {
//    public MyThread() {
//    }
//
//    public MyThread(String name) {
//        super(name);
//    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
