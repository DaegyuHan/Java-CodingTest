package baekjoon.Bronze2.Day250203;

import java.util.Scanner;

public class BOJ10813 {
    // 공 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        // 공 번호 지정
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        // 공 위치 변경
        for (int i=1; i<=M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            int temp;
            temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        // 공 번호 출력
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
