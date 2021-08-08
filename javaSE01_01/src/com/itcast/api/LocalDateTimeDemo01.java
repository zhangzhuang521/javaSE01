package com.itcast.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = localDateTime.format(formatter);
        System.out.println(s);

        String time="2021-08-08 12:00:01";
        LocalDateTime parse = LocalDateTime.parse(time, formatter);
        System.out.println(parse);
    }
}
