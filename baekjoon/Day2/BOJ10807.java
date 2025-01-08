package baekjoon.Day2;

import java.util.Scanner;

public class BOJ10807 {
    // 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        int count = 0;
        for (int i=0; i<N; i++) {
            if (V==A[i]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
