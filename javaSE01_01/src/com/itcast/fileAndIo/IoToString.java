package com.itcast.fileAndIo;

import java.io.*;

public class IoToString {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("a1.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("a2.txt"));
        char[] chars = new char[1024];
        int len;
        while((len=inputStreamReader.read(chars))!=-1){
            outputStreamWriter.write(chars,0,len);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
