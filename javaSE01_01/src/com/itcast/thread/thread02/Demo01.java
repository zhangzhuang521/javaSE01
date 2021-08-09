package com.itcast.thread.thread02;

public class Demo01 {
    public static void main(String[] args) {

        MyRunable myRunable = new MyRunable();
        Thread thread01 = new Thread(myRunable,"一");
        Thread thread02 = new Thread(myRunable,"二");

        thread01.start();
        thread02.start();
    }
}
