package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ2562 {
    // 최댓값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num = 0;

        for (int i=1; i<=9; i++) {
            int temp = sc.nextInt();
            if (temp>max) {
                max = temp;
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
