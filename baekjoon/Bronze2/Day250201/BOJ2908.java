package baekjoon.Bronze2.Day250201;

import java.util.Scanner;

public class BOJ2908 {
    // 상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        char[] arrA = String.valueOf(A).toCharArray();
        char[] arrB = String.valueOf(B).toCharArray();

        char[] result = new char[3];

        for (int i=2; i>=0; i--) {
            if (arrA[i]>arrB[i]) {
                result = arrA;
                break;
            } else if (arrA[i]<arrB[i]) {
                result = arrB;
                break;
            } else {
                continue;
            }
        }
        for (int i=2; i>=0; i--) {
            System.out.print(result[i]);
        }
    }
}
