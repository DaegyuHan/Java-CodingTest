package baekjoon.Bronze2.Day250204;

import java.util.Scanner;

public class BOJ5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = 1000 - n; // 거스름돈
        int count = 0; // 동전 개수

        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int coin : coins) {
            count += change / coin; // 해당 동전으로 줄 수 있는 개수 추가
            change %= coin; // 남은 거스름돈 갱신
        }

        System.out.println(count);
    }
}