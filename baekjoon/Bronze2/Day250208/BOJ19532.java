package baekjoon.Bronze2.Day250208;

import java.util.Scanner;

public class BOJ19532 {
    // 수학은 비대면강의입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if (arr[0]*x + arr[1]*y == arr[2] && arr[3]*x + arr[4]*y == arr[5]) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}
