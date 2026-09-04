package oop;

public class toString {
    public static void main(String[] args){

        // .oop.toString() = methods.Method inherited from the oop.Object class.
        //               Used to return a string representation of an object.
        //               By default , it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Phone phone = new Phone("Apple","Iphone 17",2025,"Black");

        System.out.println(phone);

        //System.out.println(phone.color + " " + phone.year + " " + phone.make + " " + phone.model);

    }
}
