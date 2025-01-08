package baekjoon.Bronze5.Day250108;

import java.util.Scanner;

public class BOJ18108 {
    // 1998년생인 내가 태국에서는 2541년생?!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int changedYear = year - 543;
        System.out.println(changedYear);
    }
}
