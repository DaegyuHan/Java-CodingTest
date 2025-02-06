package baekjoon.Bronze2.Day250206;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1009 {
    // 분산처리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            a %= 10; // 마지막 자리 숫자만 고려 (어차피 10의 배수 이상이면 같은 패턴 반복)
            if (a == 0) {
                System.out.println(10);
                continue;
            }

            ArrayList<Integer> arr = new ArrayList<>();
            int num = a;

            // 순환 패턴 찾기
            while (!arr.contains(num)) {
                arr.add(num);
                num = (num * a) % 10; // 마지막 자리만 남기고 곱하기
            }

            int index = (b - 1) % arr.size(); // 순환 패턴 내에서 b번째 숫자 찾기
            System.out.println(arr.get(index));
            }
        }
}
