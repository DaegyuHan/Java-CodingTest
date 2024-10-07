package cote;


public class cote24 {

    public String solution(String[] seoul) {
        String answer= "";
        for (int i=0; i< seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        cote24 sol = new cote24();
        System.out.println(sol.solution(new String[]{"Jane", "Kim"}));
    }
}
