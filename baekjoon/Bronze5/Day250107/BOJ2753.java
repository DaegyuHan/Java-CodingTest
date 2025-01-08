package baekjoon.Bronze5.Day250107;

import java.util.Scanner;

public class BOJ2753 {
    // 윤년
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N%4 == 0 & N%100!=0) {
            System.out.println("1");
        } else if (N%400==0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
