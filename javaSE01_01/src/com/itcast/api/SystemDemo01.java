package com.itcast.api;

public class SystemDemo01 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[10];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);

        }
        System.out.println(arr2.length);
    }
}
