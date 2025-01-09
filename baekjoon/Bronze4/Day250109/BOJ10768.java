package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ10768 {
    // 특별한 날
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        if (M<2) {
            System.out.println("Before");
        } else if (M>2) {
            System.out.println("After");
        } else {
            if (D>18) {
                System.out.println("After");
            } else if (D==18) {
                System.out.println("Special");
            } else {
                System.out.println("Before");
            }
        }
    }
}
