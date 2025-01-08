package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ10808 {
    // 알파벳 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        int[] a = new int[26];
        for (int i=0; i<text.length; i++) {
            a[(text[i]-97)] ++;
        }
        for (int j=0; j<a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
