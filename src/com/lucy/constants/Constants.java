package com.lucy.constants;

public class Constants {
    // 기본 생성자가 만들어 지는 것을 막는다.
    private Constants() {};
    public static final int LIMIT = 2_000_000;
}

// 절대 하나의 파일에 두가지의 클래스를 선언하면 안됨!(같은 이름의 파일이 있을 경우 컴파일시 문제가 되기도 하며 유지보수가 어렵게 된다)
// 유틸리티 클래스나 상수 클래스의 인스턴스화를 막기 위한 방법을 테스트하기 위함
class Main {
    public static void main(String[] args){
        //Constants c = new Constants(); // private 생성자가 없으면 생성자를 만들어 쓰는 클래스가 아닌데 가능하게 된다.
        System.out.println("LIMIT: "+Constants.LIMIT);
    }
}