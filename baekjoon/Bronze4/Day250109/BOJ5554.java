package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ5554 {
    // 심부름 가는 길
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a + b + c + d;
        System.out.println(sum/60);
        System.out.println(sum%60);
    }
}
