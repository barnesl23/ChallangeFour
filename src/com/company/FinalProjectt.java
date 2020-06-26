package com.company;
import java.io.*; //for file
import java.util.*;
public class FinalProjectt{

    public static int times = 0; //calculates the amount of tries
    public static int wins = 0; //calculates the amount of wins

    public static void main(String[] args) throws FileNotFoundException { //for file
        Scanner input = new Scanner(System.in); //defines scanner
        System.out.println("What is your name?");
        String name = input.next(); //creates string
        String message = returning(name); //creates string for return method
        System.out.println(message);
        int n; //defines integers

        String words; //defines another string variable
        String answer = " ";
        do { //repeats stuff in do while the wile is true
            System.out.println("Type start to begin");
            answer = input.next(); //scanner allows user to answer question
        } while (!answer.contains("start")); //! means not true

        do { //does stuff in the do loop while the while is true
            File file = new File("/Users/lindseybarnes/IdeaProjects/MySummerProject/src/com/company/FinalProject.txt");
            Scanner fileinput = new Scanner(file); //creates file scanner
            System.out.println("Would you like to play the WORD, INTEGER or DOUBLE game or QUIT to stop?");
            answer = input.next(); //scanner allows user to answer question
            answer = answer.toUpperCase(); //converts answer to all upper cased letters

            if (answer.contains("DOU")) { //runs double game if answer has double
                doublem(input, fileinput); //calling method
            }
            if (answer.contains("INT")) { //runs integer game is answer has integer
                integers(input, fileinput); //calling method
            }
            if (answer.contains("WOR")) { //runs word game if answer has word
                words(input, fileinput); //calling method
            }

        } while (answer.contains("DOU") || answer.contains("INT") || answer.contains("WOR")); //|| means or
        System.out.println("Thanks for playing! Your total number of games played was " + times + ". Your final score was " + wins);
        //displays amount of tries and wins
    }
    public static void words(Scanner input, Scanner fileinput){  //method for word game
        times++; //add to number of tries each time played
        System.out.println("Guess what Disney Princess I'm thinking of!");
        String solution = input.next(); //allows user to type
        String other = " "; //defines another String
        while (fileinput.hasNextLine()) { //brings in values and answers from file
            other = fileinput.next();
            if (other.equals(solution)) { //this tells if the users guess is correct
                wins ++; //if this is true, add to wins
                System.out.println("Congrats! That was the correct answer!!");
                break; //resumes at the next statement following the loop

            }
        }

    }

    public static void integers(Scanner input, Scanner fileinput) { //method for the integers game
        times++; //add to number of tries each time played
        System.out.println("Guess what whole numbers I'm thinking of between 1 and 100!");
        int answer = input.nextInt(); //defines int variable
        String problem = ""; //defines new string variable
        while (fileinput.hasNextLine()) { //brings in values and answers from file
            if (fileinput.hasNextInt()) {
                if (fileinput.nextInt() == answer) { //only does the following if answer is correct
                    wins++; //if this is true, add to wins
                    System.out.println("Congrats! That was the correct answer!!");
                    break;//resumes at the next statement following the loop
                }
            } else {
                problem = fileinput.next();

            }
        }
    }

    public static void doublem(Scanner input, Scanner fileinput){ //method for double
        times++; //add to number of tries each time played
        System.out.println("Guess what decimals I'm thinking of between 0.0 and 3.0!"); //directions
        double working = input.nextDouble(); //defines new double
        String outcome = " "; //defines new string
        while (fileinput.hasNextLine()) { //brings in values and answers from file
            if (fileinput.hasNextDouble()) {
                if (fileinput.nextDouble() == working) { //does the following only if the if is true
                wins++; //if this is true, add to wins
                System.out.println("Congrats! That was the correct answer!!");
                break; //resumes at the next statement following the loop
            }
            }
            else {
                outcome = fileinput.next();

                }
        }
    }
    public static String returning(String name) { //return method
        String message = ("Hello " + name);
        return message; //returns method
    }
}