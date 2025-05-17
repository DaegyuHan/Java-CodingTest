package baekjoon.Bronze2.Day250517;

import java.util.Scanner;

public class BOJ10996 {
    // 별 찍기 - 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N==1) {
            System.out.println("*");
        } else {
            for (int i=0; i<N; i++) {
                // 첫 줄 별 찍기
                for (int j=1; j<N+1; j++) {
                    if (j%2==1) {
                        // j 가 홀수면 *
                        System.out.print("*");
                    } else {
                        // j 가 짝수면 띄어쓰기
                        System.out.print(" ");
                    }
                }
                System.out.println();
                // 둘째 줄 별 찍기
                for (int k=1; k<N+1; k++) {
                    if (k%2==1) {
                        // k 가 홀수면 띄어쓰기
                        System.out.print(" ");
                    } else {
                        // k 가 짝수면 *
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
