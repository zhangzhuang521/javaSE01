package com.itcast.fileAndIo.objectTest;

import java.io.*;

public class ObjectDemo01 {
    public static void main(String[] args) throws IOException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a2.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a3.txt"));
        Student s1 = new Student("zhangsan", 18);
       objectOutputStream.writeObject(s1);
       objectOutputStream.close();
//        objectInputStream.read();
    }
}
