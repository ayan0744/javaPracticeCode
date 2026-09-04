package oop;

public class Laptop {

    private  String model;
    private String color;
    private int price;

    Laptop(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice (){
        return "Rs" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        this.price = price;
    }

}
