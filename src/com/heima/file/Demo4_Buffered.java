package com.heima.file;

import java.io.*;
import java.util.Scanner;

public class Demo4_Buffered {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));

        int b;
        while ( (b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();
    }

    /*
    * 获取文件路径
    * */
    public static File getFile () {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径");
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.exists()) {
                System.out.println("文件路径不存在，请重新输入：");
            } else if (file.isDirectory()) {
                System.out.println("您输入的是文件夹路径，请重新输入");
            } else {
                return file;
            }
        }
    }
}
