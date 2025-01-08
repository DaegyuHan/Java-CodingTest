package baekjoon.Day2;

import java.util.Scanner;

public class BOJ2420 {
    // 사파리월드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        System.out.println(Math.abs(N-M));
    }
}
