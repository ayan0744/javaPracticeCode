package oop;

public class GettersSetters {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITABLE.

        Laptop laptop = new Laptop("Acer Aspire 5", "Space Gray", 70000);

        //System.out.println(laptop.color + " " + laptop.model + " " + laptop.price);

        System.out.println(laptop.getColor() + " " + laptop.getModel() + " " + laptop.getPrice());

        // laptop.color = "Black";
        // laptop.price = "50000";

        laptop.setColor("Black");
        laptop.setPrice(50000);

        System.out.println(laptop.getColor() + " " + laptop.getModel() + " " + laptop.getPrice());

    }
}
