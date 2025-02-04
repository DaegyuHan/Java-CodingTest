package baekjoon.Bronze2.Day250204;

import java.util.Scanner;

public class BOJ2745 {
    // 진법 변환
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int N = sc.nextInt();
        int[] arr = new int[text.length];
        int result=0;

        for (int i=0; i<arr.length; i++) {
            if (47<text[i] && text[i]<58) {
                arr[i] = text[i] - 48;
            } else {
                arr[i] = text[i] - 55;
            }
        }
        for (int i=arr.length-1; i>=0; i--) {
            result += arr[i] * Math.pow(N, arr.length-i-1);
        }
        System.out.println(result);
    }
}
