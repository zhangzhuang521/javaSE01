package com.itcast.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("a");
        arrayList1.add("bb");
        arrayList1.add("c");
        arrayList1.add("dddd");
        arrayList1.add("eeee");
        arrayList1.add("ff");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("bb");
        arrayList2.add("c");
        arrayList2.add("dd");
        arrayList2.add("e");
        arrayList2.add("ff");
        //创建流对象
        Stream<String> stream1 = arrayList1.stream();
        Stream<String> stream2 = arrayList2.stream();
//        stream1.filter(s -> s.length()==2).forEach(s -> System.out.println(s));
//        System.out.println();
        Stream<String> limit = stream1.limit(3);
        Stream<String> skip = stream2.skip(2);
//        Stream.concat(limit,skip).distinct().forEach(s ->System.out.println(s) );
//        long count = Stream.concat(limit, skip).count();
//        System.out.println(count);
        Stream<String> distinct = Stream.concat(limit, skip).distinct();
//        List<String> collect = distinct.collect(Collectors.toList());
//        Set<String> collect = distinct.collect(Collectors.toSet());


    }
}
