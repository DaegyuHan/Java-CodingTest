package cote;


public class cote21 {

    public boolean solution(int x) {
        // 문자열로 전환
        boolean answer = true;
        String str = Integer.toString(x);

        int sum = 0;

        for(int i = 0; i<str.length(); i++) {
           sum += str.charAt(i) - '0';
        }

        if(x%sum == 0) {
            return answer;
        }

        return !answer;
    }

    public static void main(String[] args) {
        cote21 sol = new cote21();
        System.out.println(sol.solution(13));  // 873211 출력
    }
}
