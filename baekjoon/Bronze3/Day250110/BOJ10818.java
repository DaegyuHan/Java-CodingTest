package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ10818 {
    // 최소, 최대
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if (temp>max) max = temp;
            if (temp<min) min = temp;
        }
        System.out.println(min + " " + max);
    }
}
