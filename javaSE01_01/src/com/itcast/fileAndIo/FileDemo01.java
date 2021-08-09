package com.itcast.fileAndIo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("a1.txt");
        boolean b = file1.createNewFile();
        File file2 = new File("E:/Projects/javaSE01/javaSE01_01/aaa");
//      file2.mkdir();
//        System.out.println(b1);
        file2.delete();
        File file3 = new File("E:/Projects/javaSE01/javaSE01_01/aa/bb");
//      file3.mkdirs();
        File file4 = new File("E:/Projects/javaSE01/javaSE01_01");
        File[] files = file4.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
