package basics;

import org.w3c.dom.ls.LSOutput;
// Basic of java
public class Main {

    public static void main(String[] args) {

        System.out.print("I like pizza!\n");
        System.out.println("It's really good!");
        //we can use println or \n for new line
        // Print to error stream
        System.err.println("This is an error message");
        // Print with formatting
        System.out.printf("Hello, %s! You are %d years old.%n", "Alice", 25);

        // Variable and Data types:-
        // Variable = a reusable container for a value
        //            a variable behave as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive  vs  Reference
        // ---------      ---------
        // int            string
        // double         array
        // char           object
        // boolean

        // 2 steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 22;
        int year = 2026;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Ayan";
        System.out.println("Hello " + name);


    }
}
