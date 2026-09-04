package oop;

public class Inheritance {
    public static void main(String[] args){

        // oop.Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        DogClass dog = new DogClass();
        CatClass cat = new CatClass();
        PlantClass plant = new PlantClass();

        //System.out.println(dog.isAlive);
        //System.out.println(cat.isAlive);

        //dog.eat();
        //cat.eat();

        //System.out.println(dog.lives);
        //System.out.println(cat.lives);

       // dog.speak();
        //cat.speak();

        plant.photosynthesize();
        System.out.println(plant.isAlive);

    }
}

//         oop.Organism
//           /  \
//          /    \
//       Plant  oop.Animal
//               / \
//              /   \
//            oop.Dog   oop.Cat