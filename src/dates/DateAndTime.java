package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args){

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time);

//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        // UTC timestamp

//        Instant instant = Instant.now();
//        System.out.println(instant);

//        // Custom Format
//
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDatetime = dateTime.format(formatter);
//        System.out.println(newDatetime);

        // Custom date time object

//        LocalDate date = LocalDate.of(2026,12,25);
//        System.out.println(date);
//
//        LocalTime time = LocalTime.of(10,20,55);
//        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2004,5,10, 5,30,40);
       System.out.println(dateTime);
    }
}
