package cote;


import java.util.Arrays;

public class cote28 {

    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 1 ; i<10; i ++) {
            int finalI = i;
            boolean containsNumber = Arrays.stream(numbers).anyMatch(n -> n == finalI);
            if (!containsNumber) {
                answer = answer + finalI;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        cote28 sol = new cote28();
        System.out.println(sol.solution(new int[]{1,2,3,4,5,6,7}));
    }
}
