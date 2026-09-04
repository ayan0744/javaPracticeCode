package threading;

public class Multithreading {
    public static void main(String[] args){

        // threading.Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instruction that run independently)
        //                  Useful for background tasks or time-consuming operations

       // newMyRunnable threading.newMyRunnable = new threading.newMyRunnable();
        Thread thread1 = new Thread(new newMyRunnable("PING"));
        Thread thread2 = new Thread(new newMyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("basics.Main thread was interrupted");
        }
        System.out.println("GAME OVER!");
    }
}
