package baekjoon.Bronze3.Day250116;

import java.util.Scanner;

public class BOJ2903 {
    // 중앙 이동 알고리즘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 3;

        for (int i=1; i<N; i++) {
            num = num*2-1;
        }

        System.out.println(num*num);
    }
}
