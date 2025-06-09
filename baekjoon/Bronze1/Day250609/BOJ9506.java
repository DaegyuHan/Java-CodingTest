package baekjoon.Bronze1.Day250609;

import java.util.Scanner;

public class BOJ9506 {
    // 약수들의 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int sum = 0;
            int N = sc.nextInt();

            if (N == -1) break;

            for (int i=1; i<N; i++) {
                // 만약 N 의 약수면?
                if (N%i==0) {
                    sum += i;
                }
            }

            if (sum!=N) System.out.println(N + " is NOT perfect.");
            else {
                System.out.print(N + " = 1");
                for (int i=2; i<N; i++) {
                    // 만약 N 의 약수면?
                    if (N%i==0) {
                        System.out.print(" + " +i);
                    }
                }
                System.out.println();
            }
        }
    }
}
