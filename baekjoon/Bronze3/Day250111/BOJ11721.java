package baekjoon.Bronze3.Day250111;

import java.util.Scanner;

public class BOJ11721 {
    // 열 개씩 끊어 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i=0; i<text.length(); i=i+10) {
            if (i+10<text.length()) {
                System.out.print(text.substring(i, i+10));
            } else {
                System.out.print(text.substring(i));
            }
            System.out.println();
        }
    }
}
