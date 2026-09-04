package projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args){

        // JAVA DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES
        int numOfDice;
        int total =0;

        // GET # OF DICE FROM THE USER
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // CHECK IF # OF DICE > 0
        if(numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                // ROLL ALL THE DICE
                int roll = random.nextInt(1,7);
                printdice(roll);
                System.out.println("You rolled: "+ roll);
                // GET THE TOTAL
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice must be grater than 0");
        }
        scanner.close();
    }
    // DISPLAY ASCII OF DICE
    static void printdice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll){
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);
            default -> System.out.println("Invalid roll");

        }
    }
}
