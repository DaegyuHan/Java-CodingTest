package baekjoon.Bronze3.Day250116;

import java.util.Scanner;

public class BOJ5565 {
    // 영수증
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for (int i=0; i<9; i++) {
            int temp = sc.nextInt();
            sum -= temp;
        }
        System.out.println(sum);
    }
}
