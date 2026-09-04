package oop.anonymous;

public class Anonymous {
    public static void main(String[] args) {

        // oop.anonymous.Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                 Add custom behavior without having to create a new class.
        //                 Often used for one time uses (TimerTask, Runnable, callbacks)

        Dogg dog1 = new Dogg();
        Dogg dog2 = new Dogg(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}

