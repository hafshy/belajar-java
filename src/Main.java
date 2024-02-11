import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("rigel");
    	LocalDate today = LocalDate.now();
        LocalDate someday = LocalDate.of(
                2000,
                Month.NOVEMBER,
                7
        );

        System.out.println(today);
        System.out.println(someday);

        LocalTime now = LocalTime.now();
        LocalTime sometime = LocalTime.of(4, 40, 14);
        System.out.println(now);
        System.out.println(sometime);

        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime sometime2 = LocalDateTime.of(today, now);
        System.out.println(now2);
        System.out.println(sometime2);
    }
}