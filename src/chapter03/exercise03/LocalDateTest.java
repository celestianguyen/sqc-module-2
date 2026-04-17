package chapter03.exercise03;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(LocalDateUtil.toLocalDateV1("12/04/2003"));
        System.out.println(LocalDateUtil.toLocalDateV2("1995/12/28"));
        System.out.println(LocalDateUtil.localDateToStringV1(LocalDate.of(1888, 8, 18)));
        System.out.println(LocalDateUtil.localDateToStringV2(LocalDate.of(2020, 2, 29)));
    }
}
