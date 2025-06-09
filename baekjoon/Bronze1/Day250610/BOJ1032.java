package baekjoon.Bronze1.Day250610;

import java.util.Scanner;

public class BOJ1032 {
    // 명령 프롬프트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        char[] text = sc.nextLine().toCharArray();

        for (int i=1; i<T; i++) {
            char[] text1 = sc.nextLine().toCharArray();

            for (int j=0; j<text1.length; j++) {
                if (text[j]!=text1[j]) text[j] = '?';
            }
        }

        for (int i=0; i<text.length; i++) {
            System.out.print(text[i]);
        }
    }
}
