package com.heima.file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo5_Buffered {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("xxx.txt"));

        while (true) {
            String line = sc.nextLine();
            if ("quit".equals(line)){
                break;
            }
            bos.write(line.getBytes());
            bos.write("\n\t".getBytes());
        }
        bos.close();
    }
}
