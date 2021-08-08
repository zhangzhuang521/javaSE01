package com.itcast.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("it01","zhangsan");
        stringHashMap.put("it02","lisi");
        stringHashMap.put("it03","wangwu");
        stringHashMap.put("it04","zhaoliu");
        stringHashMap.put("it05","daqi");
        stringHashMap.put("it06","xiaoba");
        stringHashMap.put("it07","xiaojiu");
//        Set<Map.Entry<String, String>> entrySet = stringHashMap.entrySet();
//        for (Map.Entry<String, String> stringStringEntry : entrySet) {
//            System.out.println(stringStringEntry.getKey()+" "+stringStringEntry.getValue());
//        }
        Set<String> stringSet = stringHashMap.keySet();
        Stream<String> stream = stringSet.stream();//流
//        for (String s : stringSet) {
//            System.out.println(s+" "+stringHashMap.get(s));
//        }
//        Collection<String> values = stringHashMap.values();
//        for (String value : values) {
//            System.out.println(value);
//        }
    }
}
