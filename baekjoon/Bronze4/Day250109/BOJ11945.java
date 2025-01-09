package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ11945 {
    // 뜨거운 붕어빵
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (M>0) {
            for (int i = 0; i < N; i++) {
                String text = sc.next();
                char[] textArr = text.toCharArray();

                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(textArr[j]);
                }
                System.out.println();
            }
        }
    }
}
