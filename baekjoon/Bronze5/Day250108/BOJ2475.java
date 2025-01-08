package baekjoon.Bronze5.Day250108;

import java.util.Scanner;

public class BOJ2475 {
    // 검증 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        int sum = 0;
        for (int i=0; i<5; i++) {
            A[i] = sc.nextInt();
            sum = sum + A[i] * A[i];
        }
        System.out.println(sum%10);
    }
}
