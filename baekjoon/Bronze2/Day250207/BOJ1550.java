package baekjoon.Bronze2.Day250207;

import java.util.Scanner;

public class BOJ1550 {
    // 16진수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();

        int result = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;

            if ('A' <= ch && ch <= 'F') {
                value = ch - 'A' + 10;
            } else {
                value = ch - '0';
            }

            result = result * 16 + value;
        }

        System.out.println(result);
    }
}

