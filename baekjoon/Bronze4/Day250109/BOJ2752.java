package baekjoon.Bronze4.Day250109;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2752 {
    // 세수 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        Arrays.sort(a); // 오름차순
        System.out.println(a[0] + " " + a[1] + " " +a[2]);
    }
}
