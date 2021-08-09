package com.itcast.thread.thread03;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {


    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return "你很棒！";
    }
}
