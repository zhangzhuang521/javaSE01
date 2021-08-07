package com.itcast.数据类型01;

import java.util.Random;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        //常量:不可改变的数值
        //变量:内存中的一个存储空间，存放一些可以改变的数据
       /* 数据类型:
           基本数据类型:
           byte ,short,int ,lang
           float double
           char boolean
           引用数据类型:
           字符串 ，数组，集合，枚举
           计算机存储设备的最小心底单元：位 bit
           计算机的最小信息存储单元：字节 byte
           1byte=8bit
           byte （-128~127）
           int（2^-31~2^31-1）
           */

        //键盘输入
//        Scanner scanner = new Scanner(System.in);
//        String nextLine = scanner.nextLine();
//        System.out.println(nextLine);
//        Random random = new Random();
//        int i = random.nextInt(10);
//        System.out.println(i);
//        byte a=127;
//        byte b= (byte) (a+1);
//        System.out.println(b);
//        int c=2^31;
//        int d=c+1;
//        System.out.println(c);
//        int d1=2<<30-1; // 1073741824
//        int d2=2<<30;
//        System.out.println(d1);
//        System.out.println(d2);
//        byte a=10;
//        int c=a;
//        System.out.println(c);
//        int a=128;
//        byte b= (byte) a;
//        System.out.println(b);

//        byte a=10;
//        byte b=20;
//        byte c= (byte) (a+b);
//        System.out.println(c);
//        byte d=10+20;
//        System.out.println(d);
        //自增自减
//        int a = 100;
//        int b = a--;
//        int c = --a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        byte a='a';
//        System.out.println(a);
//        byte A='A';
//        byte O='0';
//        System.out.println(A);
//        System.out.println(O);
        int a=100;
       int b= (a+=1);
        System.out.println(b);


    }
}
