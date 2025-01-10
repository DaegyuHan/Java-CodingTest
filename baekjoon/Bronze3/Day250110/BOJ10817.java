package baekjoon.Bronze3.Day250110;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    // 세 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);

//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//
//        int max = Math.max(A, Math.max(B, C));
//        int min = Math.min(A, Math.min(B, C));
//
//        System.out.println(A+B+C-max-min);
    }
}
