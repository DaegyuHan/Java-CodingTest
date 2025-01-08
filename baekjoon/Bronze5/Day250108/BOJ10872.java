package baekjoon.Bronze5.Day250108;

import java.util.Scanner;

public class BOJ10872 {
    // 팩토리얼
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 1;
        for (int i=1; i<=N; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
    }
}
