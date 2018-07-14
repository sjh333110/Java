package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        int b;

        while ( (b = fis.read()) != -1) {
            System.out.println(b);
        }

        fis.close();
    }
}
