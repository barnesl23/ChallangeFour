/*
Lindsey Barnes
 6/17/20
Pseudocode
Import the random by typing import java.util.Random at the top of the screen
Import the scanner by typing import java.util.Scanner at the top of the screen
In the public static void main, define the scanner as keyboard by setting it equal to new Scanner(System.in)
Define the random as rand by setting it equal to new random
Create a string titled answer
Create an integer and make it equal to n
Create a do while loop and within the do bracket define n by setting it equal to rand.nextInt(137) +1
Print the n by doing a System.out.printLn
Make another System.out.println asking the user if they want to continue
set answer equal to keyboard.next() to use the scanner
close the do bracket and make it while the answer contains Y or y solve (n)
create another public static void titled solve(int n)
create an if statement that prints Weird if n%2 ==1
create an else if statement that prints Not Weird if n <= 6
Create another else if statement that prints Weird if n<=20
Create another else if statement that prints Not Weird if n > 20
Finish by adding brackets to close the code
*/
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //naming scanner
        Random rand = new Random(); ///naming random
        String answer; //creating string variable
        int n; //creating integer
        do { //tells the computer to display another random integer and decide weather its weird or not if person wants to continue
            n = rand.nextInt(137) + 1;
            System.out.println(n);
            solve(n); //calling method
            System.out.println("Do you want to continue (yes or no?)"); //asks user if they want to continue
            answer = keyboard.next();
        }
        while (answer.contains("Y") || answer.contains("y")); //program continues if answer with Y or y is entered
    }

    public static void solve(int n) { //receiving method
        if (n % 2 == 1) { //if the remainder is one then it is odd
            System.out.println("Weird");
        } else if (n <= 6) { //if the number is six or under
            System.out.println("Not Weird");
        } else if (n <= 20) { //if the number is from 7 to 20
            System.out.println("Weird");
        } else if (n > 20) { //if the number is over twenty
            System.out.println("Not Weird");
        }
    }
}








