package com.lucy.codility;

import java.util.HashSet;

public class Demo {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,6,4,1,2}));
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{-1, -3}));
    }

    public static int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 1 ; i <= A.length + 1 ; i ++) {
            nums.add(i);
        }

        for (int a: A) {
            nums.remove(new Integer(a));
        }
        return nums.iterator().next();
    }

}
