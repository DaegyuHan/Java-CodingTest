package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ2083 {
    // 럭비 클럽
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            String status;

            if (name.equals("#") && age == 0 && weight == 0) break;

            if (age>17 || weight>=80) status = "Senior";
            else status = "Junior";

            System.out.println(name + " " + status);
        }
    }
}
