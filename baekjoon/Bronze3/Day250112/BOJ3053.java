package baekjoon.Bronze3.Day250112;

import java.util.Scanner;

public class BOJ3053 {
    // 택시 기하학
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();

        double uclid = R * R * Math.PI;
        double taxi = R * R * 2;
        System.out.println(uclid);
        System.out.println(taxi);
    }
}
