package oop;

public class ArrayOfObject {
      public static void main(String[] args) {
    // one method
//        oop.arrayCar car1 = new oop.arrayCar("Mustang", "Red");
//        oop.arrayCar car2 = new oop.arrayCar("Corvette", "Blue");
//        oop.arrayCar car3 = new oop.arrayCar("Charger", "Yellow");
//        oop.arrayCar[] cars = {car1, car2, car3};

          // second method
          arrayCar[] cars = {new arrayCar("Mustang", "Red"),
                           new arrayCar("Corvette", "Blue"),
                           new arrayCar("Charger", "Yellow")};

//        for(int i = 0; i< cars.length;i++){
//            cars[i].drive();
//        }
        // Enhanced for loop
        for(arrayCar car : cars){
            car.drive();
        }
    }
}

