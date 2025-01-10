package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ2441 {
    // 별 찍기 -4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=N; i>0; i--) {
            for (int j=N-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
