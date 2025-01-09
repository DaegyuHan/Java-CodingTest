package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ10101 {
    // 삼각형 외우기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b+c != 180) {
            System.out.println("Error");
        } else if (a==b && a==60) {
            System.out.println("Equilateral");
        } else if (a!=b && a!=c && b!=c) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
        }
    }
}
