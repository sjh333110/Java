package com.heima.thread;

public class Demo3_ThreadMethod {
    public static void main(String[] args) {
        //getName();
        //setName1();
        new Thread(){
            public void run () {
                this.setName("heh");
                System.out.println(this.getName()+"..aaaaaa");
            }
        }.start();

        new Thread(){
            public void run () {
                this.setName("hha");
                System.out.println(this.getName()+"..bbbbb");
            }
        }.start();
    }

    private static void setName1() {
        new Thread("张三"){
            public void run () {
                System.out.println(this.getName()+"..aaaaaa");
            }
        }.start();

        new Thread("李四"){
            public void run () {
                System.out.println(this.getName()+"..bbbbb");
            }
        }.start();
    }

    private static void getName() {
        new Thread(){
            public void run () {
                System.out.println(this.getName()+"..aaaaaa");
            }
        }.start();

        new Thread(){
            public void run () {
                System.out.println(this.getName()+"..bbbbb");
            }
        }.start();
    }
}
