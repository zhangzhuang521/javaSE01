package com.itcast.collection.collection01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        System.out.println(strings);
        strings.removeIf(s -> s.equals("c"));
        strings.removeIf(s -> s.length()==1);
        System.out.println(strings);

    }
}
//Collection 的父类是Iterable

/*
Collection 单列的
子接口：list set
list的实现类 ArrayList LinkedList
set的实现类 HashSet TreeSet*/
//Map 双列的
//实现类 HashMap  TreeMap
//注意事项：
// removeIf()方法里面的参数是一个函数式接口，相当于匿名内部类