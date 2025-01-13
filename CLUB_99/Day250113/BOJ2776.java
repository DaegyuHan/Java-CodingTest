package CLUB_99.Day250113;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ2776 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            HashSet<Integer> note1 = new HashSet<>();

            for (int j = 0; j < N; j++) {
                note1.add(sc.nextInt());
            }

            int M = sc.nextInt();

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < M; j++) {
                int num = sc.nextInt();
                if (note1.contains(num)) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            }

            System.out.print(result);
        }
    }
}
