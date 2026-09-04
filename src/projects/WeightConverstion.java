package projects;

import java.util.Scanner;

public class WeightConverstion {

    public static void main(String[] agrs){
        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        //prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        // option 1 converts lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("The new weight is kgs is: %.2f", newWeight);
        }
        // option 2 converts kgs to lbs
        else if(choice ==2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight is kgs is: %.2f", newWeight);
        }
        //else print not a valid choice
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
