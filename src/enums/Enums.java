package enums;

import java.util.Scanner;

public class Enums {
     public static void main(String[] args){

//           enums.Enums = (Enumerations) A special kind of class that
//           represents a fixed set of constants.
//           They improve code readability and are easy to maintain.
//           More efficient with switches when comparing with Strings.

          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter a day of the week: ");
          String response = scanner.nextLine().toUpperCase();

          try {
               Day day = Day.valueOf(response);

//          System.out.println(day);
//          System.out.println(day.getDayNumber());

               switch (day){
                    case Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY -> System.out.println("It is a weekday");
                    case Day.SATURDAY, Day.SUNDAY -> System.out.println("It is weekend!!");
               }
          }
          catch (IllegalArgumentException e){
               System.out.println("Please enter a valid day");
          }
          scanner.close();
     }
}
