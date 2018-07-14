package com.heima.file;

import java.io.File;

public class Demo1_File {
    public static void main(String[] args) {
        //demo1();   // 绝对路径
        //demo2();   // 文件夹路径   文件名称
        //demo3();   // 父File对象  文件名称
    }

    private static void demo3() {
        File parent = new File("E:\\考研\\2017文都政治\\02 2017考研政治基础阶段\\01 马原基础精讲\\配套讲义\\");
        String child = "第13页.jpg";
        File file = new File(parent, child);
        System.out.println(file.exists());
    }

    private static void demo2() {
        String parent = "E:\\考研\\2017文都政治\\02 2017考研政治基础阶段\\01 马原基础精讲\\配套讲义\\";
        String child = "第13页.jpg";

        File file = new File(parent, child);
        System.out.println(file.exists());
    }

    private static void demo1() {
        File file1 = new File("E:\\考研\\2017文都政治\\02 2017考研政治基础阶段\\01 马原基础精讲\\配套讲义\\第13页.jpg");
        System.out.println(file1.exists());

        File file2 = new File("xxx.txt");
        System.out.println(file2.exists());
    }
}
