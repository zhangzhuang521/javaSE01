package com.itcast.fileAndIo;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = PropertiesDemo01.class.getClassLoader().getResourceAsStream("a3.txt");
//        InputStream inputStream1 = Resources.class.getResourceAsStream("a3.txt");
//        System.out.println(inputStream);
//        System.out.println(inputStream1);
//        Properties properties = new Properties();
//        FileInputStream fileInputStream = new FileInputStream("a3.txt");
//        properties.load(fileInputStream);
////        inputStream.close();
//        fileInputStream.close();
//        System.out.println(properties);
//        FileWriter fileWriter = new FileWriter("a4.txt");
//        properties.store(fileWriter,null);
//        InputStream inputStream = Resources.class.getResourceAsStream("jdbc.properties");
        InputStream inputStream = PropertiesDemo01.class.getClassLoader().getResourceAsStream("jdbc.properties");
        System.out.println(inputStream);
        Properties pro = new Properties();
        pro.load(inputStream);
        System.out.println(pro);
        inputStream.close();


    }
}
