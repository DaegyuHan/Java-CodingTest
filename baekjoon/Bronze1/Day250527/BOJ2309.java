package baekjoon.Bronze1.Day250527;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309 {
    // 일곱 난쟁이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 두 명을 제외해서 총합이 100이 되는 조합 찾기
        outer: // 루프 탈출을 위한 라벨
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    // 두 명 제외하고 출력
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(arr[k]);
                        }
                    }
                    break outer; // 정답 찾았으면 탈출
                }
            }
        }
    }
}
