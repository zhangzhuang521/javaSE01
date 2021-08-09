package com.itcast.fileAndIo;

import java.io.*;

public class BufferedByteDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("a1.txt"));
        bufferedOutputStream.write("zhangsan".getBytes());
        bufferedOutputStream.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a1.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();
    }
}
