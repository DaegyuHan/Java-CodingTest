package cote;


public class cote27 {

    public String solution(String phone_number) {
        String[] strArray = phone_number.split("");

        for (int i = 0; i< strArray.length -4; i++) {
            strArray[i] = "*";
        }

        return String.join("", strArray);
    }

    public static void main(String[] args) {
        cote27 sol = new cote27();
        System.out.println(sol.solution("010283025365"));
    }
}
