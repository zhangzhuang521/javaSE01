package com.itcast.collection.collection01;

import java.util.ArrayList;
import java.util.Collection;

public class 数组与集合的对比 {
    public static void main(String[] args) {
        int[] arr =new int[8];
        String s1="abcd";
        Collection<Integer> integers = new ArrayList<>();
        System.out.println(arr.length);
        System.out.println(s1.length());
        System.out.println(integers.size());
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
       ((ArrayList<Integer>) integers).add(2,3);
        System.out.println(integers);
        ((ArrayList<Integer>) integers).remove(2);
        System.out.println(integers);
        integers.remove(3);
        System.out.println(integers);
        ((ArrayList<Integer>) integers).set(1,3);
        System.out.println(integers);
        System.out.println(((ArrayList<Integer>) integers).get(1));
        System.out.println(integers.size());

    }
}
