package com.lucy.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0);
        System.out.println(s);
    }

    private static void unsafeAdd(List list, Object o){
        // List<String> 이 넘어 왔을 때 컴파일 오류는 없지만 런타입 에러가 발생한다.
        list.add(o);
    }

    private static void unsafeAddIsDfferentFromList(List<Object> list, Object o){
        // 컴파일 오류가 발생됨. 하위호환성 문제
        list.add(o);
    }


}
