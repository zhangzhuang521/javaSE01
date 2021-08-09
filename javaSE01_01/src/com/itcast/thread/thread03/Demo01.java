package com.itcast.thread.thread03;

import java.util.concurrent.FutureTask;

public class Demo01 {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask1 = new FutureTask<>(myCallable);
        FutureTask<String> futureTask2 = new FutureTask<>(myCallable);
        Thread thread01 = new Thread(futureTask1,"线程一");
        Thread thread02 = new Thread(futureTask2,"线程二");
        thread01.start();
        thread02.start();

    }
}
