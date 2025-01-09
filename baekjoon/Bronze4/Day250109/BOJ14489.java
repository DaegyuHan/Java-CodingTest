package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ14489 {
    // 치킨 두마리(...)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int price = sc.nextInt();

        if (a+b>=2*price) {
            System.out.println(a+b-2*price);
        } else {
            System.out.println(a+b);
        }
    }
}
