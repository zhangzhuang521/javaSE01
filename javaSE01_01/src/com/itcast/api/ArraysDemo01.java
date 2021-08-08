package com.itcast.api;

import java.util.Arrays;

public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr1={10,9,18,20,26,30,21};
        Arrays.sort(arr1);
        String s = Arrays.toString(arr1);
        System.out.println(s);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        int i = Arrays.binarySearch(arr1, 0, arr1.length, 20);
        System.out.println(i);
    }
}
