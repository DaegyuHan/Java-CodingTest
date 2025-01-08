package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ5543 {
    // 상근날드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int h = Math.min(h1, Math.min(h2, h3));
        int d = Math.min(d1, d2);

        System.out.println(h+d-50);
    }
}
