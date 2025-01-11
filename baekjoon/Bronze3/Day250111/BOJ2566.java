package baekjoon.Bronze3.Day250111;

import java.util.Scanner;

public class BOJ2566 {
    // 최댓값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int x=0;
        int y=0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                int temp = sc.nextInt();
                arr[i][j] = temp;
                if (temp>max) {
                    max = temp;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
