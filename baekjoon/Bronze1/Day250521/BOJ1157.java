package baekjoon.Bronze1.Day250521;

import java.util.Scanner;

public class BOJ1157 {
    // 단어 공부
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        int result=0;
        boolean found = false;

        for (int i=0; i< text.length; i++) {
            if (65 <= text[i] && text[i] <= 90) arr[text[i]-65]++;
            if (97 <= text[i] && text[i] <= 122) arr[text[i]-97]++;
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
                found = true;
            } else if (arr[i] == max) {
                found = false;
            }
        }
        if (!found) System.out.println("?");
        else System.out.println((char)(result+65));
    }
}
