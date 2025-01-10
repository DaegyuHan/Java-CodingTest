package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ2884 {
    // 알람 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M<45) {
            H-=1;
            M+=15;
            if (H==-1) H=23;
        } else {
            M-=45;
        }
        System.out.println(H + " " + M);
    }
}
