package baekjoon.Bronze2.Day250519;

import java.util.Scanner;

public class BOJ7567 {
    // 그릇
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] boilArray = sc.next().toCharArray();
        int result = 10;

        for (int i=1; i< boilArray.length; i++) {
            if (boilArray[i-1] == boilArray[i]) {
                result += 5;
            } else {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
