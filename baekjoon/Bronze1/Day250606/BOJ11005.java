package baekjoon.Bronze1.Day250606;

import java.util.Scanner;

public class BOJ11005 {
    // 진법 변환 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 변환할 수
        int B = sc.nextInt(); // 진법

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            // 10 이상일 경우 A~Z 문자로 변환
            if (remainder >= 10) {
                sb.append((char) ('A' + (remainder - 10)));
            } else {
                sb.append(remainder);
            }
            N /= B;
        }

        System.out.println(sb.reverse());  // 뒤집어서 출력
    }
}
