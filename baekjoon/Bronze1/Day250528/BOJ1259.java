package baekjoon.Bronze1.Day250528;

import java.util.Scanner;

public class BOJ1259 {
    // 팰린드롬수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String check = "yes";
            char[] arr = sc.next().toCharArray();
            if (arr[0] == '0') break;

            for (int i=0; i<arr.length/2; i++) {
                if (arr[i]!=arr[arr.length-1-i]) {
                    check = "no";
                }
            }
            System.out.println(check);
        }
    }
}
