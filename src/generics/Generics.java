package generics;

import javax.swing.event.DocumentEvent;
import java.util.ArrayList;
public class Generics {
    public static void main(String[] args){

        // generics.Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("orange");
//        fruits.add("banana");


//        oop.Box<String> box = new oop.Box<>();
//        box.setItem("banana");
//        System.out.println(box.getItem());

//        oop.Box<Integer> box = new oop.Box<>();
//        box.setItem(3);
//        System.out.println(box.getItem());

//        oop.Box<Double> box = new oop.Box<>();
//        box.setItem(3.14);
//        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 0.50);
        Product<String, Integer> product2 = new Product<>("Ticket", 12);

        System.out.println(product2.getPrice());







    }
}
