package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ16486 {
    // 운동장 한 바퀴
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println(d1*2 + d2*2*3.141592);
    }
}
