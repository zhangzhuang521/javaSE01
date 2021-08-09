package com.itcast.fileAndIo;

import java.io.*;

public class BufferedCharDemo01 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a1.txt",true));
//        bufferedWriter.newLine();
//        bufferedWriter.write("lisi");
//        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a1.txt"));
        String len;
        while((len=bufferedReader.readLine())!=null){
            System.out.println(len);
        }
        bufferedReader.close();
    }
}
