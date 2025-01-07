package baekjoon.Day1;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        System.out.println(A/B);

        // float double 의 정밀도
        // float => 소수점 6~7자리
        // double => 소수점 15~16 자리 정도까지 표현 가능

        // 코딩테스트에서는 웬만하면 float 보다는 double 쓰는 게 더 좋다.
    }
}
