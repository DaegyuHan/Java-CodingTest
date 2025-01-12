package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2445 {
    // 별 찍기 -8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<2*N; j++) {
                if (i+j+1>=2*N || j<=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=N-1; i>=0; i--) {
            for (int j=0; j<2*N; j++) {
                if (i+j>=2*N || j<i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
