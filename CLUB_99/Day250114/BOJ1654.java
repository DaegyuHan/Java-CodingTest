package CLUB_99.Day250114;

import java.util.Scanner;

public class BOJ1654 {
    // 랜선 자르기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int K = sc.nextInt(); // 가지고 있는 랜선의 개수
        int N = sc.nextInt(); // 필요한 랜선의 개수
        long[] cables = new long[K];

        long max = 0; // 랜선의 최대 길이
        for (int i = 0; i < K; i++) {
            cables[i] = sc.nextLong();
            max = Math.max(max, cables[i]); // 가장 긴 랜선의 길이를 저장
        }

        long left = 1; // 랜선의 최소 길이
        long right = max; // 랜선의 최대 길이
        long result = 0;

        // 이분 탐색
        while (left <= right) {
            long mid = (left + right) / 2; // 중간 길이
            long count = 0;

            // mid 길이로 자른 랜선의 개수 계산
            for (long cable : cables) {
                count += cable / mid;
            }

            // 랜선을 충분히 만들 수 있으면 길이를 늘려본다
            if (count >= N) {
                result = mid; // 가능한 길이 저장
                left = mid + 1;
            } else {
                right = mid - 1; // 길이를 줄여본다
            }
        }

        // 결과 출력
        System.out.println(result);
        sc.close();
    }
}
