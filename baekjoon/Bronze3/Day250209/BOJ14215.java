package baekjoon.Bronze3.Day250209;

import java.util.Scanner;

public class BOJ14215 {
    // 세 막대
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        int sum = a + b + c - max;

        int result = (sum > max) ? a+b+c : 2*sum -1;

        System.out.println(result);

    }
}
