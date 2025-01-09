package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ4470 {
    // 줄번호
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=N; i++) {
            System.out.println(i + ". " + sc.nextLine());
        }
    }
}
