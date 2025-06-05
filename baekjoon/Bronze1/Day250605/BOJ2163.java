package baekjoon.Bronze1.Day250605;

import java.util.Scanner;

public class BOJ2163 {
    // 초콜릿 자르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = (N-1) + (M-1) * N;
        System.out.println(result);
    }
}
