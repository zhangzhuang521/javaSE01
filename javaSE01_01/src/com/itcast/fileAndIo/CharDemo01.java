package com.itcast.fileAndIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a1.txt",true);
        fileWriter.write("zhangsan");
        fileWriter.close();
        FileReader fileReader = new FileReader("a1.txt");
        char[] chars = new char[1024];
        int len;
        while((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
