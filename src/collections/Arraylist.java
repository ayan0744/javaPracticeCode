package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args){

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but Arraylists can change.

//        // Creation of array list of integer
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);

//        // Creation of array list of double
//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(1.23);
//        list.add(2.43);
//        list.add(3.55);
//        System.out.println(list);\

//        // Creation of array list of integer
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Coconut");
        //System.out.println(fruits);

//        fruits.remove(3);
//        System.out.println(fruits);

//        fruits.set(0,"Pineapple");

       // System.out.println(fruits.get(0));

//        System.out.println(fruits.size());

//        Collections.sort(fruits);
////        System.out.println(fruits);
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        // collections.Arraylist Exercise:-
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i=1;i<=num;i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);


        scanner.close();
    }
}
