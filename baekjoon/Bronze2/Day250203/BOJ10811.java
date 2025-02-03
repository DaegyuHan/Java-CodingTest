package baekjoon.Bronze2.Day250203;

import java.util.Scanner;

public class BOJ10811 {
    // 바구니 뒤집기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        // 바구니 번호 지정
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        // 바구니 뒤집기
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            // x부터 y까지 뒤집기
            while (x < y) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        }
        // 바구니 번호 출력
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
