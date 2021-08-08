package com.itcast.collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 可变参数 {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3);
        System.out.println(sum);


    }

    public static int getSum(int... a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
//        Stream<int[]> a1 = Stream.of(a);
        return sum;
    }
}
