package basics;// To take user input, we need a scanner class
// A scanner is an object that allows as to accept user input in java
// And need to import from the certain package called utilities or util.

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        // to accept the user input we need to create a scanner object.
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        // String name = scanner.next(); //--> next() will take input till space
//        String name = scanner.nextLine();   //--> nextLine() take full input
//
//        System.out.print("Enter Your age: ");
//        int age = scanner.nextInt(); // to take integer input we use nextInt();c
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name + "!");
//        System.out.println("Your age is " + age);
//        System.out.println("Your GPA is " + gpa);
//        //System.out.println("oop.Student: " + isStudent);
//        if(isStudent)
//            System.out.println("You are enrolled as a student");
//        else
//            System.out.println("You are not enrolled");

        // Common Issues
        System.out.print("Enter your age: ");
        // nextInt() reads only the integer, leaves '\n' (newline) in buffer
        int age = scanner.nextInt();

        // ⚠️ IMPORTANT: Consume the leftover '\n' after nextInt()
        // Without this line, nextLine() below will read empty string
        scanner.nextLine(); // ✅ consume leftover newline
        // After nextInt(), nextDouble() etc. → always add this scanner.nextLine()!

        System.out.print("Enter your favorite color: ");
        // nextLine() reads the full line including spaces
        // Works correctly now because leftover '\n' was consumed above

        String color = scanner.nextLine();

        System.out.println("Your age " + age + " years old");
        System.out.println("Your like the " + color + " color");

       // Alternative Fix — Use nextLine() + Parse
        System.out.print("Enter your age: ");
        double age2 = Double.parseDouble(scanner.nextLine()); // read as String, convert to int
        
        System.out.print("Enter your favorite color: ");// Always close the Scanner when done to free resources
        String color2 = scanner.nextLine(); // works perfectly

          System.out.println("Your age " + age2 + " years old");
          System.out.println("Your like the " + color2+ " color");
        
        scanner.close();
    }
}



