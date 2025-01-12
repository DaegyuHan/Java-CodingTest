package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ10162 {
    // 전자레인지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T%10==0) {
            int A = T/300;
            int B = (T%300)/60;
            int C = (T%300)%60/10;
            System.out.println(A+" "+B+" "+C);
        } else {
            System.out.println(-1);
        }
    }
}
