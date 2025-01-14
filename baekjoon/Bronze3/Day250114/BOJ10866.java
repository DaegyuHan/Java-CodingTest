package baekjoon.Bronze3.Day250114;

import java.util.Scanner;

public class BOJ10866 {
    // 0 = not cute / 1 = cute
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cuteCount = 0;
        int notCuteCount = 0;

        for (int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if (temp==1) cuteCount++;
            else notCuteCount++;
        }
        if (cuteCount>notCuteCount) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
