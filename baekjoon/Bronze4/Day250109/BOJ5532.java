package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ5532 {
    // 방학 숙제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int spend_A = A/C;
        if (A%C !=0) spend_A +=1;
        int spend_B = B/D;
        if (B%D !=0) spend_B +=1;

        System.out.println(L-Math.max(spend_A, spend_B));
    }
}
