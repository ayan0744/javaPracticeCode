package oop;

public class MethodOverriding {
    public static void main(String[] args){

        // methods.Method Overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Bike bike = new Bike();
        Jeep jeep = new Jeep();

        bike.showTyre();
        jeep.showTyre();
    }
}
