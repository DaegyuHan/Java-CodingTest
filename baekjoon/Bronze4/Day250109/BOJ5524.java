package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ5524 {
    // 입실 관리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            String name = sc.next();
            char[] nameArr = name.toCharArray();
            for (int j=0; j< nameArr.length; j++) {
                if (nameArr[j] < 'a') {
                    System.out.print((char)(nameArr[j] + 32));
                } else {
                    System.out.print(nameArr[j]);
                }
            }
            System.out.println();
        }
    }
}