package com.lucy.codility;

public class BinaryGap {

    public static void main (String[] args) {
        System.out.println(solution(9));
        System.out.println("---------");
        System.out.println(solution(529));
        System.out.println("---------");
        System.out.println(solution(20));
        System.out.println("---------");
        System.out.println(solution(15));
        System.out.println("---------");
        System.out.println(solution(32));
        System.out.println("---------");
        System.out.println(solution(1041));
        System.out.println("---------");


    }

    public static int solution(int N) {
        char[] binary = makeBinaryArr(N);

        int max = 0;
        int mark = -1;
        for (int i = 0 ; i < binary.length ; i++) {
            if (binary[i] == '1') {
                if (mark != -1) {
                    max = max(max, i - mark - 1);
                }
                mark = i;
            }
        }

        return max;
    }

    public static char[] makeBinaryArr(int N) {
        return Integer.toBinaryString(N).toCharArray();
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
