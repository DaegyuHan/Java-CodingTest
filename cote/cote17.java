package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class cote17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();
        int n = sc.nextInt();
        //int[] answer = {};
        // 10 으로 나누기해서 나머지 배열로 저장
        // 몫 i 를 또 10으로 저장 ( 반복 )
        // 조건은 몫이 0 될 때까지

        while (n != 0) {
            answer.add(n%10);
            n = n/10;
        }
        System.out.println(answer);
    }


}