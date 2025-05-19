package baekjoon.Bronze2.Day250519;

import java.util.Scanner;

public class BOJ10820 {
    // 문자열 분석
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            char[] text = sc.nextLine().toCharArray();
            int small = 0;
            int big = 0;
            int num = 0;
            int blank = 0;

            for (int i = 0; i < text.length; i++) {
                // 공백 32
                if (text[i] == 32) blank++;
                // 숫자 48~57
                else if (48 <= text[i] && text[i] <= 57) num++;
                // 대문자 65~90
                else if (65 <= text[i] && text[i] <= 90) big++;
                // 소문자 97~122
                else if (97 <= text[i] && text[i] <= 122) small++;

            }
            System.out.printf("%d %d %d %d\n", small, big, num, blank);
        }
    }
}
