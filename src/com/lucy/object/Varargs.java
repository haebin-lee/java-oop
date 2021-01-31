package com.lucy.object;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Varargs {

    public static void main(String[] args) {

//        List<String> stringList = List.of("1", "2");
//        dangerous(stringList);
//
//        String[] attributes = pickTwo("좋은", "빠른", "저렴한");

        List<String> stringList1 = List.of("룰루", "랄라");
        List<String> stringList2 = List.of("1", "2");
        List<String> returnList = flatten(stringList1, stringList2);
        System.out.println(returnList);

        System.out.println(flatten(List.of(stringList1, stringList2)));

        List<String> attributes = pickTwoV2("좋은", "빠른", "저렴한");
        System.out.println(attributes);

    }

    static void dangerous(List<String>... stringList) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringList;
        objects[0] = intList; // 힙 오염 발생
        String s = stringList[0].get(0); // ClassCastException
        System.out.println(s);
    }

    static <T> T[] toArray(T...args) {
        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError(); // 도달할 수 없다.
    }

    static <T> List<T> pickTwoV2(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a, b);
            case 1: return List.of(a, c);
            case 2: return List.of(b, c);
        }
        throw new AssertionError(); // 도달할 수 없다.
    }

    @SafeVarargs
    static <T> List<T> flatten(List<? extends  T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

    static <T> List<T> flatten(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }


}
