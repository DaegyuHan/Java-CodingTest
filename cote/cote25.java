package cote;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cote25 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();
        for (int i:arr) {
            if (i%divisor == 0) {
                answerList.add(i);
            }
        }
        Collections.sort(answerList);

        if (answerList.isEmpty()) {
            return new int[]{-1};  // 만약 조건에 맞는 값이 없으면 -1 반환
        } else {
            return answerList.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        cote25 sol = new cote25();
        System.out.println(java.util.Arrays.toString(sol.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}
