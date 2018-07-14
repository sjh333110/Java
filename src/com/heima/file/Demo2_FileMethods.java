package com.heima.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethods {
    public static void main(String[] args) throws IOException {
        //demo1();
        File file1 = new File("aaa");
        System.out.println(file1.mkdir());

        File file2 = new File("bbb\\ccc");
        System.out.println(file2.mkdirs());
        return;
    }

    private static void demo1() throws IOException {
        File file = new File("YYY.txt");
        System.out.println(file.createNewFile());
    }
}
