package oop;

public class Abstraction {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            oop.Abstraction is the process of hiding implementation details
        //            and showing only the essential feature;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (Which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
