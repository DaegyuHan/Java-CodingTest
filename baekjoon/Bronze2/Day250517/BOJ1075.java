package baekjoon.Bronze2.Day250517;

import java.util.Scanner;

public class BOJ1075 {
    // 나누기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();

        for (int i=N-N%100; i<=N+100; i++) {
            if (i%F==0) {
                if (i%100<10) {
                    System.out.print("0"+i%100);
                } else {
                    System.out.println(i % 100);
                }
                break;
            }

        }
    }
}
