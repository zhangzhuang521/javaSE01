package com.itcast.thread.thread06;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable{

    private int pick = 100;

    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
         lock.lock();
                if (pick == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pick--;
                    System.out.println(Thread.currentThread().getName() + "还剩" + pick + "张票");
                }
            lock.unlock();
        }
    }
}
