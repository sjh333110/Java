package com.heima.file;

import java.io.File;

public class Demo3_FileMethods {
    public static void main(String[] args) {
        //demo1();
        File file1 = new File("YYY.txt");
        System.out.println(file1.delete());

        File file2 = new File("aaa\\ooo.txt");
        System.out.println(file2.delete());

        File file3 = new File("bbb\\ccc");
        System.out.println(file3.delete());

        File file4 = new File("bbb");
        System.out.println(file4.delete());

        File file5 = new File("aaa");
        System.out.println(file5.delete());
    }

    private static void demo1() {
        File file1 = new File("ooo.txt");
        File file2 = new File("aaa\\ooo.txt");
        file1.renameTo(file2);
    }
}
