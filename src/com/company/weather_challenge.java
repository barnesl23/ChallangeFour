/*
Lindsey Barnes
 6/17/20
Pseudocode
Import scanner
import random
in public static void main define the scanner and call it input
create int named index
create do while loop asking the person how many days they want the weather for and repeating until a valid number is entered
create an array titled myArray
create a random titled randy
create a double titled total
create a integer titled c
create a loop that adds a number for each day
create an array that displays a random number between 20 and 110
create a System.out.println telling the user both the day and the temperature (which is the array)
change value of double variable to the array
create a double titled average which is calculated by the total temperature / number of days
create a new System.out.println which tells the average temp
create a for loop increasing average by one if there is another day over average
type c++ to count each day above average
create a new System.out.println telling the user how many days are above average
*/
package com.company;
import java.util.Scanner; //this allows us to use scanner
import java.util.Random; //allows us to use random
public class weather_challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates scanner named input
        int index; //creates integer that is used for the amount of days used
        do { //do while loop repeats question until valid number is entered
            System.out.println("How many days do you want the weather for?"); //asks user question
            index = input.nextInt(); //scanner lets user answer question
        } while (index < 2 || index > 100); //outlines valid range of numbers

        int[] myArray = new int[index]; //creates input array
        Random randy = new Random(); //creates random number
        double total = 0.0; //creates number with decimal for average temperature
        int c = 0; //creates real number integer
        for (int i = 0; i < index; i++) { //for loop adds on each day
            myArray[i] = randy.nextInt(85) + 25; //gives temperature a range for valid numbers
            System.out.println("Day " + (i+1) + "'s" + " Temperature: " + myArray[i]); //writes the day and temperature
            total = total + myArray[i]; //changes value of total to incorporate array
        }
        double average = total / index; //calculates average temperature by total / number of days
        System.out.println("Average temp: " + average); //writes the average temp
        for (int i = 0; i < index; i++) { //for loop creates an increase for every day above average
            if (myArray[i] > average) {
                c++; //adds to number of days above average
            }
        }
        System.out.println(c + " days are above the average temperature" ); //calculates days above average temp
    }
}