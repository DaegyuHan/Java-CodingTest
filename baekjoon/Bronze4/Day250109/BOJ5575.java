package baekjoon.Bronze4.Day250109;

import java.util.Scanner;

public class BOJ5575 {
    // 타임 카드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            int Sh = sc.nextInt();
            int Sm = sc.nextInt();
            int Ss = sc.nextInt();
            int Eh = sc.nextInt();
            int Em = sc.nextInt();
            int Es = sc.nextInt();

            // 시작 초 > 끝나는 초
            if (Ss>Es) {
                Es+=60;
                Em--;
            }
            Es -= Ss;
            if (Sm>Em) {
                Em+=60;
                Eh--;
            }
            Em -= Sm;
            System.out.println((Eh-Sh) + " " + (Em) + " " + (Es));
        }
    }
}
