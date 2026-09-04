package projects;

import java.util.Scanner;

public class JavaArrayQuiz {
    public static void main(String[] args){
        //JAVA QUIZ GAME

        // QUESTION array[]
        String[] question = {"What is the main function of a router?",
                             "Which part of the computer is considered the brain?",
                             "What year was facebook launched?",
                             "Who is known as the father of computer?",
                             "What is the first programing language?"};

        // OPTIONS array[]
        String[][] options = {{"1. Storing files", "2. Encrypting data","3. Directing internet traffic", "4. Managing password"},
                              {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. COBOL","2. C","3. Fortran","4. Assembly"}};

        // DECLARE VARIABLES & Answer
            int[] answer = {3,1,2,4,3};
            int score = 0;
            int guess;

        Scanner scanner = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        // QUESTION (loop)
        for(int i=0;i<question.length;i++){
            System.out.println(question[i]);
            //    OPTIONS
            for(String option : options[i]){
                System.out.println(option);
            }

            //    GET GUESS FORM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //    CHECK OUR GUESS
            if(guess == answer[i]){
                System.out.println("***************");
                System.out.println("Correct Answer!");
                System.out.println("***************");
                score++;
            }
            else{
                System.out.println("***************");
                System.out.println("Wrong Answer!");
                System.out.println("***************");
            }
        }
        // DISPLAY FINAL SCORE
        System.out.println("Your final score is: " + score + " out of " + question.length);

        scanner.close();
    }
}
