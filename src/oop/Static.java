package oop;

public class Static {
    public static void main(String[] args){
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");

       // System.out.println(oop.Friend.noOfFriends);

        Friend.showFriends();
    }
}
