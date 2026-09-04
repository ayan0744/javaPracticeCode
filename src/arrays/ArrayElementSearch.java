package arrays;

import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //INTEGER SEARCH
//        int[] numbers = {1,9,2,8,5,4};
//        int target = 0;
//        boolean isFound = false;
//
//        for(int i = 0; i < numbers.length; i++){
//                if(target == numbers[i]){
//                System.out.println("Element Found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound){
//            System.out.println("Element not found!");
//        }

        // STRING SEARCH
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;
        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();


        for(int i =0; i< fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("Element Found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
           System.out.println("Element not found in the array");
       }
        scanner.close();
    }
}
