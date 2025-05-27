package baekjoon.Bronze1.Day250527;

import java.util.Scanner;

public class BOJ1924 {
    // 2007년
    public static void main(String[] args) {
        int m[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();
        int sum = 0;

        for (int i=0; i<M; i++) {
            sum += m[i];
        }
        System.out.println(day[(sum+D)%7]);
    }
}
