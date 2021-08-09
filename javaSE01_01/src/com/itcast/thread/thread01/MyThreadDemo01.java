package com.itcast.thread.thread01;

public class MyThreadDemo01 {
    public static void main(String[] args) {
//        MyThread myThread01 = new MyThread("线程一");
//        MyThread myThread02 = new MyThread("线程二");
        MyThread myThread01 = new MyThread();
        MyThread myThread02 = new MyThread();
        myThread01.setName("线程一");
        myThread02.setName("线程二");
//        int priority = myThread01.getPriority();
//        myThread02.setPriority(10);
//        System.out.println(priority);
        myThread02.setDaemon(true);
        myThread01.start();
        myThread02.start();
    }
}
