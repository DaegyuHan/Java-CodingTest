package baekjoon.Bronze1.Day250522;

import java.util.Scanner;

public class BOJ2869 {
    // 달팽이는 올라가고 싶다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day = ((V-B)+(A-B-1))/(A-B);
        System.out.println(day);
    }
}
