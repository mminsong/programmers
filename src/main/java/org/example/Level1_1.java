package org.example;

import java.util.Arrays;

public class Level1_1 {
    public static void main(String[] args) {
        long[] s = solution(2,5);
        System.out.println(Arrays.toString(s));
    }
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=1;i<=n;i++){
            answer[i-1]=x*i;
        }
        return answer;
    }
}
