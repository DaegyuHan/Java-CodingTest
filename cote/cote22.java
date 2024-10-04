package cote;


public class cote22 {

    public long solution(int a, int b) {
        long answer = 0;
        // a 가 b 보다 크거나 같은 경우
        if (a >= b) {
            for (int i = b ; i<=a; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i<=b; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        cote22 sol = new cote22();
        System.out.println(sol.solution(3,3));  // 873211 출력
    }
}
