package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2_CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("yyy.txt");
        FileWriter fw = new FileWriter("zzz.txt");
        int c;

        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
