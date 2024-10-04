package cote;


import java.util.Arrays;
import java.util.Collections;

public class cote20 {

    public long solution(long n) {
        // 1. 숫자를 문자열로 변환
        String str = Long.toString(n);

        // 2. 문자열을 배열로 변환 후 정렬
        String[] strArray = str.split("");  // 각 자릿수를 배열로 변환
        Arrays.sort(strArray, Collections.reverseOrder());  // 내림차순 정렬

        // 3. 배열을 다시 문자열로 합치기
        String sortedStr = String.join("", strArray);

        // 4. 문자열을 다시 숫자로 변환
        return Long.parseLong(sortedStr);
    }

    public static void main(String[] args) {
        cote20 sol = new cote20();
        System.out.println(sol.solution(118372));  // 873211 출력
    }
}
