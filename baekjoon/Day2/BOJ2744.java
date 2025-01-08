package baekjoon.Day2;

import java.util.Scanner;

public class BOJ2744 {
    // 대소문자 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        for (int i=0; i<text.length; i++) {
            if (text[i]>= 'a' && text[i]<= 'z') {
                System.out.print((char) (text[i]-32));
            } else {
                System.out.print((char) (text[i]+32));
            }
        }
    }
}
