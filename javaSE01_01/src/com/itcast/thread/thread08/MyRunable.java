package com.itcast.thread.thread08;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable {

    private static int pick = 100;

    //    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean flag = synchronizedMethod();
                if (flag) {
                    break;
                }
            }
            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (MyRunable.class) {
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
                }
            }
        }
    }

    private static synchronized boolean synchronizedMethod() {
        if (pick == 0) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pick--;
            System.out.println(Thread.currentThread().getName() + "还剩" + pick + "张票");
            return false;
        }
    }
}
