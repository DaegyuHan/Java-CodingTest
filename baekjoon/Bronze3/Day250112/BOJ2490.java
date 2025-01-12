package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ2490 {
    // 윷놀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                int temp = sc.nextInt();
                if (temp == 1) count++;
            }
            if (count == 4) System.out.println("E");
            else if (count == 3) System.out.println("A");
            else if (count == 2) System.out.println("B");
            else if (count == 1) System.out.println("C");
            else System.out.println("D");
        }
    }
}
