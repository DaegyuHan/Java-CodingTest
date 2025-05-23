package baekjoon.Bronze1.Day250523;

import java.util.Scanner;

public class BOJ11653 {
    // 소인수분해
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        while (N != 1) {
            int num = 2;
            while(true) {
                if (N % num == 0) {
                    System.out.println(num);
                    N /= num;
                    break;
                } else {
                    num++;
                }
            }
        }
    }
}
