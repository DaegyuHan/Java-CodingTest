package baekjoon.Bronze3.Day250110;

import java.util.Scanner;

public class BOJ2588 {
    // 곱셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        char[] second = sc.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i=2; i>=0; i--) {
            int temp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first*temp);
            sum += first*temp*su;
            su *= 10;
        }
        System.out.println(sum);


//        System.out.println(a* (b[2]-'0'));
//        System.out.println(a*(b[1]-'0'));
//        System.out.println(a*(b[0]-'0'));
//        System.out.println(a*(b[0]-'0')*100 + a*(b[1]-'0')*10 + a*(b[2]-'0'));
    }
}
