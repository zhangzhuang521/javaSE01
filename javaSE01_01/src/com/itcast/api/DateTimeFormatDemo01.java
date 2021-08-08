package com.itcast.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        System.out.println("---------");
        String time="2021-08-08 12:00:00";
        Date date1 = simpleDateFormat.parse(time);
        System.out.println(date1);

    }
}
