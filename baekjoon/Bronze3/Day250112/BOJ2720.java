package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2720 {
    // 세탁소 사장 대규
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A;
        int B;
        int C;
        int D;

        for (int i=0; i<T; i++) {
            int money = sc.nextInt();
            A = money/25;
            B = (money%25)/10;
            C = ((money%25)%10)/5;
            D = ((money%25)%10)%5;
            System.out.println(A + " " + B + " " + C + " " +D);
        }
    }
}
