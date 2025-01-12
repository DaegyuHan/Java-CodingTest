package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2455 {
    // 지능형 기차
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            sum = sum - out + in;
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
