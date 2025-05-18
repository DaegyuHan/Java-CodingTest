package baekjoon.Bronze2.Day250518;

import java.util.Scanner;

public class BOJ25501 {
    // 재귀의 귀재
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i<T; i++) {
            String text = sc.next();
            count = 0;
            System.out.println(isPalindrome(text)+ " "+count);
        }
    }

    // 재귀 여부 확인 함수
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    // 확인 횟수 함수
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}
