package com.lucy.generic;

public class StackMain {
    public static void main(String [] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("2");

        System.out.println("pop >>> " + stack.pop());
        System.out.println("pop >>> " + stack.pop());

        String[] test = {"a", "b", "c", "d"};
        // 제너릭 Stack을 사용하는 맛보기 프로그램
        Stack2<String> stack2 = new Stack2<>();
        for(String arg: test)
            stack2.push(arg);
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop().toUpperCase());
        }
    }
}
