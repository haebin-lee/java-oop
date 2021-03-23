package com.lucy.functional;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Map<String, Long> freq = new HashMap<>();

        // 빈도표에서 가장 흔한 단어 10개를 뽑아내는 파이프라인
        List<String> topTen = freq.keySet().stream()
                .sorted(Comparator.comparing(freq::get).reversed())
                .limit(10)
                .collect(Collectors.toList());

        // toMap 수집기를 사용하여 문자열을 열거타입 상수에 매핑한다.



    }
}
