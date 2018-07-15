package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("xxx.txt");
        int c;
        while ((c = file.read()) != -1) {
            System.out.print((char) c);
        }
        file.close();
    }
}
