package baekjoon.Bronze4.Day250108;

import java.util.Scanner;

public class BOJ2439 {
    // 별 찍기 -2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 띄어쓰기 N-1 별 1
        // 띄어쓰기 N-2 별 2
        // ,,,
        // 띄어쓰기 N-3 별 5
        for (int i=N-1; i>=0; i--) {
            for (int j=0; j<i; j++) System.out.print(" "); // 띄어쓰기
            for (int k=N-i; k>0; k--) System.out.print("*");
            System.out.println();
        }
    }
}
