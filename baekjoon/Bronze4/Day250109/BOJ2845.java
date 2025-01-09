package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ2845 {
    // 파티가 끝나고 난 뒤
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();

        for (int i=0; i<5; i++) {
            System.out.print(sc.nextInt()-L*P + " ");
        }
    }
}
