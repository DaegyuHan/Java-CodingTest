package baekjoon.Bronze1.Day250520;

import java.util.Scanner;

public class BOJ1110 {
    // 더하기 사이클
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ori = sc.nextInt();
        int Next = Ori;
        int count = 0;


        while (true) {
            int first, second;
            // 원래 수가 10보다 작은 경우
            if (Next < 10) {
                first = 0;
                second = Next;

                // 이외의 경우
            } else {
                first = Next / 10;
                second = Next % 10;
            }
            count++;
            Next = second * 10 + (first + second) % 10;
            if (Ori == Next) {
                System.out.println(count);
                break;
            }
        }
    }
}

