package com.itcast.collection.set;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("lisi", 18);
        Student s2 = new Student("wangwu", 20);
        Student s3 = new Student("zhangsan", 19);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

    }
}
