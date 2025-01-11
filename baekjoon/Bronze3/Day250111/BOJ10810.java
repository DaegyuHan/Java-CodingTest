package baekjoon.Bronze3.Day250111;

import java.util.Scanner;

public class BOJ10810 {
    // 공 넣기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[sc.nextInt()];
        int M = sc.nextInt();

        for (int x=0; x<M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int y=i-1; y<=j-1; y++) {
                A[y] = k;
            }
        }
        for (int x=0; x<A.length; x++) {
            System.out.print(A[x]+" ");
        }
    }
}
