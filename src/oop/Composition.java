package oop;

public class Composition {
    public static void main(String[] args){

        // oop.Composition = Represents a "part-of" relationship between objects.
        //               For example, an oop.Engine is "part of" a oop.Car.
        //               Allows complex objects to be constructed from smaller objects.

        Caar car = new Caar("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

          car.start();
    }
}
