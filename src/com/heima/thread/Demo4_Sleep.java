package com.heima.thread;

public class Demo4_Sleep {
    public static void main(String[] args) throws InterruptedException {
        //demo1();
        new Thread(){
            @Override
            public void run() {
               for (int i=20; i>=0; i--){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(this.getName()+"..aaaa");
               }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i=20; i>=0; i--){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"...bbbb");
                }
            }
        }.start();
    }

    private static void demo1() throws InterruptedException {
        for(int i=20; i>=0; i--) {
            Thread.sleep(1000);
            System.out.println("倒计时第" + i + "秒");
        }
    }
}
