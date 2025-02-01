package baekjoon.Bronze2.Day250201;

import java.util.Scanner;

public class BOJ1978 {
    // 소수 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i=0; i<N; i++) {
            int temp = sc.nextInt();
            boolean isTrue = true;

            if (temp==1) isTrue = false;
            else {
                for (int j=2; j<temp; j++) {
                    if (temp%j==0) isTrue = false;
                }
            }
            if (isTrue) count++;
        }
        System.out.println(count);
    }
}
