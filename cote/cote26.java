package cote;


public class cote26 {

    public int solution(int[] absolutes, boolean[] signs) {
        // 반복문을 돌면서 각각의 요소 순서에 맞게 조건을 달성

        int answer = 0;

        for (int i = 0; i<absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        cote26 sol = new cote26();
        System.out.println(sol.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
}
