package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//CLASS-1
 //       String[] fruits = {"apple", "orange", "banana", "coconut"};
//        System.out.println(fruits); // this give the memory address bcoz array is REFERENCE data type
//        System.out.println(fruits[1]);

//        int length = fruits.length;
        //Normal for-loop
//        for (int i = 0; i < length; i++){
//            System.out.print(fruits[i] + " ");
//        }

       // Arrays.sort(fruits); // sort the fruits array alphabetically
        //Arrays.fill(fruits, "pineapple"); // fill the array the value

        //enhanced for-loop
//        for(String fruit : fruits){
//            System.out.print(fruit + " "); // for-each loop
//        }

        //CLASS-2;
//        String[] foods = {"pizza","taco","hamburger"}
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
//        size = scanner.nextInt();
//        scanner.nextLine();
        size = Integer.parseInt(scanner.nextLine());
        foods = new String[size];

        for(int i=0; i< foods.length;i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }


        scanner.close();
    }
}
