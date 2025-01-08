package baekjoon.Bronze5.Day250108;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ10699 {
    // 오늘 날짜
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
