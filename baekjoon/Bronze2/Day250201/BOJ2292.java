package baekjoon.Bronze2.Day250201;

import java.util.Scanner;

public class BOJ2292 {
    // 벌집
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int sum = 1;
        while(true) {
            if (N>sum) {
                count++;
                sum = sum + count*6;
            } else {
                System.out.println(count+1);
                break;
            }
        }
    }
}
