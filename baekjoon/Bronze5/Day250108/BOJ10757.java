package baekjoon.Bronze5.Day250108;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    // 큰 수 A+B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));
    }
}
