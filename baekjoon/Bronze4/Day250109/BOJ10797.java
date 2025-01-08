package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ10797 {
    // 10부제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] cars = new int[5];
        int count = 0;

        for (int i=0; i<5; i++) {
            cars[i] = sc.nextInt();
            if (a == cars[i]) count++;
        }
        System.out.println(count);
    }
}
