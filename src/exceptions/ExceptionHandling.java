package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("That was't a number!");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (Exception e) {
            // safety net
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("This always executes");
            // this always executes!!
        }



    }
}
