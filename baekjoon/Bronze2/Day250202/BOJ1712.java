package baekjoon.Bronze2.Day250202;

import java.util.Scanner;

public class BOJ1712 {
    // 손익분기점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = 0;

        while(true) {
            if (C>B) {
                result = A/(C-B) +1;
                System.out.println(result);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }
    }
}
