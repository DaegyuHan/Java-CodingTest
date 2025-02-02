package baekjoon.Bronze2.Day250202;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2920 {
    // 음계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrA = new int[8];
        int[] arrB;

        for (int i=0; i<8; i++) {
            arrA[i] = sc.nextInt();
        }

        arrB = arrA.clone();
        Arrays.sort(arrB);
        if (Arrays.equals(arrA,arrB)) {
            System.out.println("ascending");
        } else {
            for (int i=0; i<4; i++) {
                int temp = arrB[i];
                arrB[i] = arrB[7-i];
                arrB[7-i] = temp;
            }
            if (Arrays.equals(arrA,arrB)) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        }
    }
}
