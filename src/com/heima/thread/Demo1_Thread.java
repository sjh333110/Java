package com.heima.thread;

public class Demo1_Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //mt.run();  //只会调用普通方法
        mt.start();

        for (int i=0; i<1000; i++) {
            System.out.println("123456");
        }
    }
}

class MyThread extends Thread  {
    public void run () {
        for (int i=0; i<1000; i++) {
            System.out.println("56789");
        }
    }

}
