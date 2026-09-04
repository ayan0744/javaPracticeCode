package oop;

public class arrayCar {
    String model;
    String color;

    arrayCar(String model, String color){
        this.model = model;
        this.color = color;
    }

   void drive(){
       System.out.println("You drive the " + this.color + " " + this.model);
   }
}
