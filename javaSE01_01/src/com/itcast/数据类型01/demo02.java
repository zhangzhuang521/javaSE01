package com.itcast.数据类型01;

public class demo02 {
    public static void main(String[] args) {
//        if(1<2){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        int week=3;
//        switch (week){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("qita");
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//
//        while (true) {
//            System.out.println("i");
//        }
//        int[] arr = new int[6];
//        System.out.println(arr);
//        System.out.println(arr.length);
//
//        int a = 12 << 2;
//        System.out.println(a);
//        byte c = 6 & 1;
//        System.out.println(c);
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


    }
}
