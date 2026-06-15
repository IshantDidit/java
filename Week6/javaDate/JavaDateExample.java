package Week6.javaDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateExample {
    static void main(String[] args) {
        LocalDate today= LocalDate.now();
        System.out.println("today"+today);
        LocalTime time = LocalTime.now();
        System.out.println("Time"+time);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm:s");
        String formattedDate= localDateTime.format(dateTimeFormatter);
        System.out.println("new date" + formattedDate);
    }
}

