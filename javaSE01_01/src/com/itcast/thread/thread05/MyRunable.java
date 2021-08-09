package com.itcast.thread.thread05;

public class MyRunable implements Runnable{

    private int pick = 100;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (pick == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pick--;
                    System.out.println(Thread.currentThread().getName() + "还剩" + pick + "张票");
                }
            }
        }
    }
}
