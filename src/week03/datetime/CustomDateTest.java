
package week03.datetime;
public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 12, 2020);
        CustomDate date2 = new CustomDate(2, 1, 2020);
        CustomDate leapDay = new CustomDate(2, 29, 2024);
        System.out.print("Date 1: ");
        date1.displayDate();
        System.out.print("Formatted date: ");
        date1.displayFormatted();
        System.out.print("Leap day: ");
        leapDay.displayFormatted();
        System.out.println("Difference in days: " + date1.difference(date2));
        System.out.println("Compare date1 and date2: " + CustomDate.compare(date1, date2));
        System.out.println("Compare date2 and date1: " + CustomDate.compare(date2, date1));
        System.out.println("Compare same dates: " + CustomDate.compare(date1, date1));
    }
}
