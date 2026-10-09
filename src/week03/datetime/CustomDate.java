
package week03.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        LocalDate.of(year, month, day);

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        LocalDate.of(year, month, day);
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        LocalDate.of(year, month, day);
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        LocalDate.of(year, month, day);
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public long difference(CustomDate date) {
        return ChronoUnit.DAYS.between(
                date.toLocalDate(), this.toLocalDate()
        );
    }

    public static int compare(
            CustomDate date1, CustomDate date2) {

        if (date1.toLocalDate().isBefore(date2.toLocalDate())) {
            return 1;
        }

        if (date1.toLocalDate().isAfter(date2.toLocalDate())) {
            return -1;
        }

        return 0;
    }

    public void displayFormatted() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);

        System.out.println(toLocalDate().format(formatter));
    }

    private LocalDate toLocalDate() {
        return LocalDate.of(year, month, day);
    }
}
