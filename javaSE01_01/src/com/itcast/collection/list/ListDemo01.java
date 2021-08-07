package com.itcast.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo01 {
    public static void main(String[] args) {
        //迭代器
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
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
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if("c".equals(s)){
               arrayList.remove(s);
            }
            System.out.println(s);
        }

    }
}
