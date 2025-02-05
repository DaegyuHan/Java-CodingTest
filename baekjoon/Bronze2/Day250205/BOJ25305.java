package baekjoon.Bronze2.Day250205;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ25305 {
    // 커트라인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[N];

        for (int i=0; i< scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        System.out.println(scores[scores.length-k]);
    }
}
