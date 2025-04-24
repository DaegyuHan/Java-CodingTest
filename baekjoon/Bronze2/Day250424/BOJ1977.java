package baekjoon.Bronze2.Day250424;

import java.util.Scanner;

public class BOJ1977 {
    // 완전제곱수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i=N; i<=M; i++) {
            int sqrt = (int) Math.sqrt(i);
            // 완전제곱수면 sum 에 추가
            if (sqrt * sqrt == i) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
