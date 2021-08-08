package com.itcast.api;

public class StringAndInt {
    public static void main(String[] args) {
//        int-->String
//        方式一
        int a1=100;
        String s1=""+a1;
        System.out.println(s1);
//        方式二
        String s2 = String.valueOf(a1);
        System.out.println(s2);
//        String==>int
//        方式一
        String s3="10";
        Integer integer = Integer.valueOf(s3);
        int i = integer.intValue();
        System.out.println(i);

//        方式二
        int i1 = Integer.parseInt(s3);
        System.out.println(i1);


    }
}
