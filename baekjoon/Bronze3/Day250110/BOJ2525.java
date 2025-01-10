package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ2525 {
    // 오븐 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int M = 0;

        if (B+C>=60) {
            A += (B+C)/60;
            M = (B+C)%60;
            if (A>=24) A-=24;
        } else {
            M = B+C;
        }
        System.out.println(A + " " + M);
    }
}
