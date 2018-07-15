package com.heima.chario;

public class Demo5_Wrap {
    public static void main(String[] args) {
        HeiMaStudent hms = new HeiMaStudent(new Student());
        hms.code();
    }
}

interface Coder {
    public void code();
}

class Student implements Coder {

    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }
}

class HeiMaStudent implements Coder {
    private Student s;

    public HeiMaStudent (Student s) {
        this.s = s;
    }

    @Override
    public void code() {
        s.code();
        System.out.println("大数据");
        System.out.println("数据库");
        System.out.println("安卓");
        System.out.println("....");
    }
}