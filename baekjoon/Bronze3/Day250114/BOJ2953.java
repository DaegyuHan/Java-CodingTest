package baekjoon.Bronze3.Day250114;

import java.util.Scanner;

public class BOJ2953 {
    // 나는 요리사다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int win = 0;

        for (int i=0; i<5; i++) {
            int sum = 0;
            // 한 명 4개 점수 입력
            for (int j=0; j<4; j++) {
                int temp = sc.nextInt();
                // 점수 최댓값 저장
                sum += temp;
            }
            if (sum>max) {
                max = sum;
                win = i+1;
            }
        }
        System.out.println(win + " " + max);
    }
}
