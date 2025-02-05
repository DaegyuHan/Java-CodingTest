package baekjoon.Bronze2.Day250205;

import java.util.Scanner;

public class BOJ13458 {
    // 시험 감독
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] students = new int[N];
        long count = 0;
        // 교실마다 학생 수
        for (int i=0; i< students.length; i++) {
            students[i] = sc.nextInt();
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int i=0; i<students.length; i++) {
            int temp  = students[i]-A;
            count += 1;
            if (temp>0) {
                if (temp%B==0) count += temp/B;
                else count += temp/B+1;
            }
        }
        System.out.println(count);
    }
}
