package baekjoon.Bronze2.Day250517;

import java.util.Scanner;

public class BOJ1076 {
    // 저항
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        long result = (getValues(A)[0] * 10L + getValues(B)[0]) * getValues(C)[1];

        System.out.println(result);


    }

    // 색상에 따른 숫자 값
    public static int[] getValues(String color) {
        int a = 0;
        int b = 0;
        switch (color) {
            case "black":
                a = 0;
                b = 1;
                break;
            case "brown":
                a = 1;
                b = 10;
                break;
            case "red":
                a = 2;
                b = 100;
                break;
            case "orange":
                a = 3;
                b = 1000;
                break;
            case "yellow":
                a = 4;
                b = 10000;
                break;
            case "green":
                a = 5;
                b = 100000;
                break;
            case "blue":
                a = 6;
                b = 1000000;
                break;
            case "violet":
                a = 7;
                b = 10000000;
                break;
            case "grey":
                a = 8;
                b = 100000000;
                break;
            case "white":
                a = 9;
                b = 1000000000;
                break;
            default:
                System.out.println("잘못된 색상입니다");
                break;
        };
        return new int[]{a, b};
    }
}
