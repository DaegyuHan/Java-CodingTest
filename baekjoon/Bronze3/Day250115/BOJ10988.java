package baekjoon.Bronze3.Day250115;

import java.util.Scanner;

public class BOJ10988 {
    // 팰린드롬인지 확인하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        boolean isF = true;

            for (int i=0; i<text.length/2; i++) {
                if (text[i] != text[text.length-1-i]) {
                    isF = false;
                    break;
                }
            }

        System.out.println(isF? 1: 0);
    }
}
