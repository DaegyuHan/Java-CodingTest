package baekjoon.Bronze3.Day250114;

import java.util.Scanner;

public class BOJ2576 {
    // 홀수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();    // 숫자 7개 입력 받기
            if (temp % 2 == 1) {        // if 홀수
                sum += temp;        // 홀수 합 추가
                min = Math.min(temp, min);  // 최소값 갱신
            }
        }
        if (sum == 0) {     // 홀수가 없으면
            sum = -1;
            System.out.println(sum);
        } else {            // 홀수 있으면
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
