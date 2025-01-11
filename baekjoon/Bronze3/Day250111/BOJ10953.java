package baekjoon.Bronze3.Day250111;

import java.util.Scanner;

public class BOJ10953 {
    // A+B -6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<N; i++) {
            String nums = sc.nextLine();
            String[] numsArr = nums.split(",");
            int result = Integer.parseInt(numsArr[0]) + Integer.parseInt(numsArr[1]);
            System.out.println(result);
        }
    }
}
