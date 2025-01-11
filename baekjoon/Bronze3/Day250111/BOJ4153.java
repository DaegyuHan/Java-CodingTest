package baekjoon.Bronze3.Day250111;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ4153 {
    // 직각삼각형
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        while(true) {
            for (int i=0; i<3; i++) {
                A[i] = sc.nextInt();
            }
            if (A[0]==0 && A[1]==0 && A[2]==0) break;
            Arrays.sort(A);

            if (A[0]*A[0] + A[1]*A[1] == A[2]*A[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
