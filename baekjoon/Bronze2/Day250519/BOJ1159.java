package baekjoon.Bronze2.Day250519;

import java.util.Scanner;

public class BOJ1159 {
    // 농구 경기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[26];
        int count = 0;

        for (int i=0; i<N; i++) {
            char[] name = sc.next().toCharArray();
            arr[name[0]-97]++;
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>=5) System.out.print((char)(i+97));
            else count++;
        }
        if (count==27) System.out.println("PREDAJA");
    }
}
