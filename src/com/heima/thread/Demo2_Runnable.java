package com.heima.thread;

public class Demo2_Runnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread p = new Thread(mr);
        p.start();

        for (int i=0; i<1000; i++) {
            System.out.println("123456");
        }
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            System.out.println("56789");
        }
    }
}