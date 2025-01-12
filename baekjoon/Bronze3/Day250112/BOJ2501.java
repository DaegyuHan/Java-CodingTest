package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2501 {
    // 약수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int result = 0;
        boolean find = false;

        for (int i=1; i<=N; i++) {
            if (N%i==0) count++;
            if (count==K) {
                find = true;
                result = i;
                break;
            }
        }

        if (find) System.out.println(result);
        else System.out.println(0);
    }
}
