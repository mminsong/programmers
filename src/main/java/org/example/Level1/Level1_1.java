package org.example.Level1;
//함수 solution은 정수 x와 자연수 n을 입력 받아
//x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다
//x는 -10000000 이상, 10000000 이하인 정수
//n은 1000 이하인 자연수입니다.
import java.util.Arrays;

public class Level1_1 {
    public static void main(String[] args) {
        long[] s = solution1(2,5);
        System.out.println(Arrays.toString(s));
    }
    public static long[] solution1(long x, int n) {
        long[] answer = new long[n];
        for(int i=1;i<=n;i++){
            answer[i-1]=x*i;
        }
        return answer;
    }
}
