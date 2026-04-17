package chapter03.exercise03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Create a LocalDateUtil class that contains static methods to perform the following tasks:
 * + Convert a string in the format dd/MM/yyyy to a LocalDate.
 * + Convert a string in the format yyyy/MM/dd to a LocalDate.
 * + Convert a LocalDate to a string in the format dd/MM/yyyy.
 * + Convert a LocalDate to a string in the format yyyy/MM/dd.
 */
public class LocalDateUtil {

    public static LocalDate toLocalDateV1(String dateDayFirst) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateDayFirst, formatter);
        return date;
    }

    public static LocalDate toLocalDateV2(String dateYearFirst) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(dateYearFirst, formatter);
        return date;
    }

    public static String localDateToStringV1(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate1 = date.format(formatter);
        return strDate1;
    }

    public static String localDateToStringV2(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String strDate2 = date.format(formatter);
        return strDate2;
    }


}
