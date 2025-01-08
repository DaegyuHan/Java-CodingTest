package baekjoon.Day2;

import java.util.Scanner;

public class BOJ9086 {
    // 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i=0; i<T; i++) {
            String text = sc.nextLine();
            String answer =
                    text.substring(0, 1) +
                    text.substring(text.length()-1);
            System.out.println(answer);
        }
    }
}
