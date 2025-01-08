package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ2530 {
    // 인공지능 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int time = sc.nextInt();

        int new_s = (s+time)%60;
        int new_m = (m+(s+time)/60)%60;
        int new_h = (h+(m+(s+time)/60)/60)%24;
        System.out.println(new_h + " " + new_m + " " + new_s);
    }
}
