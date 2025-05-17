package baekjoon.Bronze2.Day250517;

import java.util.Scanner;

public class BOJ2902 {
    // KMP 는 왜 KMP 일까?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();

        System.out.print(text[0]);
        for (int i=0; i<text.length; i++) {
            if (text[i] == '-') {
                System.out.print(text[i+1]);
            }
        }
    }
}
