package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2522 {
    // 별 찍기 -12
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i<=2*N-1; i++) {
            for (int j=0; j<N; j++) {
                if ((i<=N&&j+i>=N) || (i>N&&j>=i-N)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
