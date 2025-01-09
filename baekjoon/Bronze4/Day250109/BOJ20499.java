package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ20499 {
    // Darius 님 한타 안 함?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kda = sc.nextLine().split("/");
        int K = Integer.parseInt(kda[0]);
        int D = Integer.parseInt(kda[1]);
        int A = Integer.parseInt(kda[2]);

        if (K+A<D || D==0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}
