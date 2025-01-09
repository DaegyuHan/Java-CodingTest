package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ10987 {
    // 모음의 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        int count = 0;

        for (int i=0; i<text.length; i++) {
            if (text[i] == 'a' || text[i] == 'e' || text[i] == 'i' || text[i] == 'o' || text[i] == 'u') count++;
        }
        System.out.println(count);
    }
}
