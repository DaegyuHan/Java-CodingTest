package baekjoon.Bronze5.Day250108;

import java.util.Scanner;

public class BOJ3003 {
    // 킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {
        int A[] = {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<6; i++) {
            int temp = sc.nextInt();
            System.out.print(A[i] - temp + " ");
        }
    }
}
