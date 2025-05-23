package baekjoon.Bronze1.Day250523;

import java.util.Scanner;

public class BOJ2609 {
    // 최대공약수와 최소공배수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = 1;

        for (int i=A; i>0; i--) {
            if (A%i==0) {
                if (B%i==0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        while(true) {
            if (N*A%B==0) {
                System.out.println(N*A);
                break;
            } else {
                N++;
            }
        }
    }
}
