package com.itcast.thread.thread05;


public class Demo01 {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread01 = new Thread(myRunable, "窗口一");
        Thread thread02 = new Thread(myRunable, "窗口二");
        thread01.start();
        thread02.start();
    }
}
