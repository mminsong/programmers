package org.example.Level1;
//대문자와 소문자가 섞여있는 문자열 s가 주어짐
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴
// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않음
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return
public class Level1_2 {
    public static void main(String[] args) {
        System.out.println(solution2("pPyy"));
    }
    public static boolean solution2(String s) {
        int psum=0;
        int ysum=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='p' || arr[i]=='P')
                psum++;
            else if(arr[i]=='y' || arr[i]=='Y')
                ysum++;
        }
        if(psum==ysum)
            return true;
        else
            return false;
    }
}
