package projects;

import java.util.Scanner;
public class CompoundInterest{
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      double principle;
      double rate;
      int timeCompounded;
      int years;
      double amount;

      System.out.print("Enter the principle amount: ");
      principle = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("Enter the interest rate (in %): ");
      rate = scanner.nextDouble()/100;
      scanner.nextLine();

      System.out.print("Enter the # of times compound per year: ");
      timeCompounded = scanner.nextInt();
      scanner.nextLine();

      System.out.print("Enter the # of years: ");
      years = scanner.nextInt();
      scanner.nextLine();

      amount = principle * Math.pow(1 + (rate / timeCompounded ), (timeCompounded * years));

      System.out.print("The amount after "+ years +" years is $" +amount);

   scanner.close();
    }
}
