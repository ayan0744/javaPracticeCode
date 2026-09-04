package oop;

public class Polymorphism {
    public static void main(String[] args){

        // oop.Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as object of a common superclass.
        //                polymorphism can also be achieved using interfaces.
        newCar car = new newCar();
        newBike bike = new newBike();
        newBoat boat = new newBoat();

//        car.go();
//        bike.go();
//        boat.go();

        newVehicle[] vehicles = {car,bike, boat};

        for(newVehicle vehicle: vehicles){
            vehicle.go();
        }

    }
}
