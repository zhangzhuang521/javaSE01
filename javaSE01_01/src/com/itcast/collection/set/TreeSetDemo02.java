package com.itcast.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Student s1 = new Student("lisi", 12);
        Student s2 = new Student("wangwu", 21);
        Student s3 = new Student("zhangsan", 19);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }
}
