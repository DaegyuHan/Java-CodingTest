package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ24723 {
    // 녹색 거탑
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 1;
        for (int i=1; i<=N; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
