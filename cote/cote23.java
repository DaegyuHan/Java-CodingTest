package cote;


public class cote23 {

    public int solution(int num) {
        int answer = 0;
        long cal = num;

            while (cal!=1 && answer<500) {
                // 짝수 -> /2
                if (cal % 2 == 0) {
                    cal = cal / 2;
                    answer += 1;
                }
                // 홀수 -> *3 +1
                else {
                    cal = (cal * 3) + 1;
                    answer += 1;
                }
            }
            if (answer == 500) return -1;
            return answer;
    }

    public static void main(String[] args) {
        cote23 sol = new cote23();
        System.out.println(sol.solution(626331));
    }
}
