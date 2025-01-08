package baekjoon.Bronze4.Day250108;

import java.util.Scanner;

public class BOJ2440 {
    // 별 찍기 -3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=N; i>0; i--) {   // 5 4 3 2 1
            for (int j=1; j<=i; j++) {  // 1 2 3 4 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
