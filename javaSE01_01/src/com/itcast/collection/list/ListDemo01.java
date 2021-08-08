package com.itcast.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ListDemo01 {
    public static void main(String[] args) {
        //迭代器
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("g");
        arrayList.add("e");
        arrayList.add("f");
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //创建迭代器对象
//        Iterator<String> iterator = arrayList.iterator();
//        while(iterator.hasNext()){
////            System.out.println(iterator.next());
//            String s = iterator.next();
//            if("c".equals(s)){
//                iterator.remove();
//            }
//        }
//        System.out.println(arrayList);


//        for (String s : arrayList) {
//            if("c".equals(s)){
//                arrayList.remove(s);
//            }
//            System.out.println(s);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            String s = arrayList.get(i);
//            if("c".equals(s)){
//               arrayList.remove(s);
//            }
//            System.out.println(s);
//        }

        int[] arr={1,2,3,4};
        IntStream stream = Arrays.stream(arr);
        long count = stream.filter(s -> s >= 2).count();
        System.out.println(count);
    }
}
