package basics;

import java.util.Random;
public class RandomClass {
    public static void main(String[] args){

        Random random = new Random();

        int number1;

        double num;

        number1 = random.nextInt(1,7); // first number inclusive and second is exclusive
        System.out.println(number1);

        num = random.nextDouble(); // generate number between 0 and 1
        System.out.println(num);

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
