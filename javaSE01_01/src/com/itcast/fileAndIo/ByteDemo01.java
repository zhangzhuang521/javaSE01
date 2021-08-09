package com.itcast.fileAndIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a1.txt",true);
        byte[] bytes = "itcast1".getBytes();
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(bytes);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("itheima1".getBytes());
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("a1.txt");
        byte[] bytes1 = new byte[1024];
        int len;
        while((len=fileInputStream.read(bytes1))!=-1){
            System.out.println(new String(bytes1,0,len));
        }
        byte[] bytes2 = "张".getBytes();
        System.out.println(bytes2);
//        for (int i = 0; i < bytes2.length; i++) {
//            System.out.println(bytes2[i]);
//        }
        int length = bytes2.length;
        System.out.println(length);
        System.out.println();
        fileInputStream.close();
    }
}
