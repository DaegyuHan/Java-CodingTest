package baekjoon.Bronze1.Day250528;

import java.util.Scanner;

public class BOJ2748 {
    // 피보나치 수 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long first = 0;
        long second = 1;

        for (int i=2; i<=N; i++) {
            long result = first + second;
            first = second;
            second = result;
        }
        System.out.println(second);
    }
}
