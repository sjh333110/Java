package com.heima.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo3_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("yyy.txt",true);
        file.write("java基础班");
        file.write("97");
        file.close();
    }
}
