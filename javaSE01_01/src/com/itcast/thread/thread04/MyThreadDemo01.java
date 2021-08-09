package com.itcast.thread.thread04;

public class MyThreadDemo01 {
    public static void main(String[] args) {
//        这种事错误的演示,多线程操作共享资源
        MyThread myThread01 = new MyThread("线程一");
        MyThread myThread02 = new MyThread("线程二");
        myThread01.start();
        myThread02.start();
    }
}
