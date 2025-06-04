package baekjoon.Bronze1.Day250604;

import java.util.Scanner;

public class BOJ10798 {
    // 세로 읽기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[5][15];

        for (int i=0; i<5; i++) {
            char[] text = sc.nextLine().toCharArray();
            for (int j=0; j<15; j++) {
                if (j < text.length) {
                    map[i][j] = text[j];
                } else {
                    map[i][j] = ' ';
                }
            }
        }

        for (int j=0; j<15; j++) {
            for (int i=0; i<5; i++) {
                if (map[i][j] != ' ') System.out.print(map[i][j]);
            }
        }

    }
}
