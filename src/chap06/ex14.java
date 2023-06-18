package chap06;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

// 달력의 배열을 정렬

public class ex14 {
    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2022, Calendar.NOVEMBER, 1),        // 2022년11월01일
                new GregorianCalendar(1963, Calendar.OCTOBER, 18),        // 1963년10월18일
                new GregorianCalendar(1985, Calendar.APRIL, 5),           // 1985년04월05일
        };

        Arrays.sort(x);  // 배열 x를 정렬

        for (int i = 0; i < x.length; i++)
            System.out.printf("%04d년%02d월%02d일\n",
                    x[i].get(Calendar.YEAR),
                    x[i].get(Calendar.MONTH) + 1,
                    x[i].get(Calendar.DATE));
    }
}
