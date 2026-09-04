package oop;

public class Friend {

    static int noOfFriends ;

    String name ;

    Friend (String name){
        this.name = name;
        noOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + noOfFriends + " total friends");
    }
}
