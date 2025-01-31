package baekjoon.Bronze2.Day250131;

import java.util.Scanner;

public class BOJ8958 {
    // OX 퀴즈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<T; i++) {
            int score = 0;
            int count = 0;
            char[] result = sc.nextLine().toCharArray();

            // result 돌면서 O 면 점수+1, X면 추가점수 초기화
            for (int j=0; j<result.length; j++) {
                if (result[j]=='O') {
                    count++;
                    score+=count;
                } else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
