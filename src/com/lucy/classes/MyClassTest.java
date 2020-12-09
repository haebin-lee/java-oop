package com.lucy.classes;

public class MyClassTest {
    public static void main(String[] args){

        System.out.println("TEST 1");
        MyClass.InnerClass mic1 = new MyClass().new InnerClass();
        MyClass.InnerClass mic2 = new MyClass().new InnerClass();

        if (mic1 == mic2) {
            System.out.println("내부 클래스는 새로만들어도 같은 참조지");
        } else {
            System.out.println("내부 클래스도 클래스니까 다른 참조지");
        }

        System.out.println("TEST 2");
        MyClass.InnerStaticClass misc1 = new MyClass.InnerStaticClass();
        MyClass.InnerStaticClass misc2 = new MyClass.InnerStaticClass();

        if (misc1 == misc2) {
            System.out.println("내부 스태틱 클래스는 새로만들어도 같은 참조지");
        } else {
            System.out.println("내부 스태틱 클래스도 클래스니까 다른 참조지");
        }

        System.out.println("TEST 3");
        MyClass mc = new MyClass();
        MyClass.InnerClass mic3 = mc.new InnerClass(); //mic3은 "mc에 대한 숨은 외부 참조"를 갖는다.

        MyClass.InnerStaticClass misc3 = new MyClass.InnerStaticClass(); //misc3은 그딴 거 없다
    }
}
