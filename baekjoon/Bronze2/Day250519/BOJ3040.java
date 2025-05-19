package baekjoon.Bronze2.Day250519;

import java.util.Scanner;

public class BOJ3040 {
    // 백설공주와 일곱난쟁이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] numArr = new int[9];

        for (int i=0; i<9; i++) {
            int N = sc.nextInt();
            numArr[i] = N;
            sum += N;
        }

        // 배열을 돌면서
        outer:
        for (int i=0; i<9; i++) {
            // 다른 배열 요소들과 하나씩 비교
            for (int j=0; j<9; j++) {
                // 만약에 총 합에서 100을 뺀 값이 두 요소의 합과 같으면
                if (sum-100-numArr[i] == numArr[j] && numArr[i] != numArr[j]) {
                    numArr[i] = 0;
                    numArr[j] = 0;
                    break outer;
                }
            }
        }

        for (int i=0; i<9; i++) {
            if (numArr[i] != 0) System.out.println(numArr[i]);
        }
    }
}
