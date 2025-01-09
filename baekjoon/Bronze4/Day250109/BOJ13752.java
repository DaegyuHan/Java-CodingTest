package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ13752 {
    // 히스토그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int k = sc.nextInt();
            for (int j=0; j<k; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
