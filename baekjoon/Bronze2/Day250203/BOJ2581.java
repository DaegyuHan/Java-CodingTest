package baekjoon.Bronze2.Day250203;

import java.util.Scanner;

public class BOJ2581 {
    // 소수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 0;

        boolean isFirst = true;

        for (int i=M; i<=N; i++) {
            int count = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) count++;
            }
            if (count==2) {
                sum += i;
                if (isFirst) {
                    min = i;
                    isFirst = false;
                }
            }
        }

        if (sum == 0 && min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
