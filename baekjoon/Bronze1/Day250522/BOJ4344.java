package baekjoon.Bronze1.Day250522;

import java.util.Scanner;

public class BOJ4344 {
    // 평균은 넘겠지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i=0; i<C; i++) {
            int N = sc.nextInt();
            int[] scores = new int[N];
            int sum = 0;
            int count = 0;

            for (int j=0; j<N; j++) {
                int S = sc.nextInt();
                scores[j] = S;
                sum += S;
            }
            for (int j=0; j<N; j++) {
                if (scores[j] > sum/N) count++;
            }
            System.out.printf("%.3f%%\n", (count * 100.0) / N);
        }
    }
}
