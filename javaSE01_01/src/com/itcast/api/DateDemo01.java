package com.itcast.api;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
//        long time = date.getTime();
//        long millis = System.currentTimeMillis();
//        System.out.println(time);
//        System.out.println(millis);
        Date date1 = new Date(1000 * 60 * 60);
        System.out.println(date1);
        date.setTime(1000*60*60);
        System.out.println(date);
    }
}
