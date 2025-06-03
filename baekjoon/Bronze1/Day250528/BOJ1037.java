package baekjoon.Bronze1.Day250528;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1037 {
    // 약수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (T == 1) {
            System.out.println(arr[0]*arr[0]);
        } else {
            System.out.println(arr[0]*arr[T-1]);
        }
    }
}
