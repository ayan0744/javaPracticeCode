package methods;

import java.util.Scanner;

public class Method {
    public static void main(String[] args){
//        String name = "Ayan";
//        int age = 22;
//        happyBirthday(name,age);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the number: ");
//        double num = scanner.nextDouble();
//        double result = square(num);
//        System.out.println(result);

//        System.out.print("Enter your first name: ");
//        String firstname = scanner.next();
//        System.out.print("Enter your last name: ");
//        String lastname = scanner.next();
//        String fullName= getFullName(firstname,lastname);
//        System.out.println("Hello "+ fullName);

        System.out.println(add(1,3));


        scanner.close();
    }
    // methods.Method = a block of reusable code that is executed when called ()->method
    static void happyBirthday(String name , int age ){
        System.out.println("Happy Birthday to you " + name);
        System.out.printf("You are %d years old!",age);

    }
    // square a number
    static double square(double num){
        return num * num;
    }
    static String getFullName(String fname, String lname){
        return fname + " " + lname;
    }


    // overload method = method that share the same name
    //                   but different parameter
    //                   signature = name + parameters

    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }


}

