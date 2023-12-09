package org.example.Level1;
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, soultion을 완성하세요.
//s의 길이는 1이상 5이하입니다.
//s의 맨앞에는 부호(+,-)가 올 수 있습니다.
//s는 부호와 숫자로만 이루어져있습니다.
//s는"0"으로 시작하지 않습니다.

public class Level1_3 {
    public static void main(String[] args){
        System.out.println(soultion3("-123"));
        System.out.println(soultion3("123"));
    }
    public static int soultion3(String s){
        int answer=Integer.parseInt(s);
        return answer;
    }
}
