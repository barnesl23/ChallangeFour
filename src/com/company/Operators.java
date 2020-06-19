/*
Lindsey Barnes
 6/17/20
Pseudocode
type import java.util.Scanner at the top of the screen for the Scanner class
Within the public static void main, declare your scanner known as meal and set it equal to new Scanner(System.in)
Create a system.out.println "please enter the cost of the meal"
Create your double and call it price - set it equal to meal.nextDouble for the scanner
Write a System.out.println "please enter the tip percent"
Create another double and call it tipPercent - set it equal to meal.nextDouble for the scanner
Create another double and call it tip, set it equal tp price times tipPercent/100.
Create a System.out.println "please enter the tax percentage"
Create a double titled taxPercent and set it equal to meal.nextDouble for the scanner
Create a double titled tax and set it equal to (price times taxPercent/100)
Create a double titled totalPrice and set it equal to price + tax + tip
create a System.out.println stating "Your total is " + Math.round(totalPrice)
 */

package com.company;
import java.util.Scanner;
public class Operators {
    public static void main(String [] args){
        Scanner meal = new Scanner(System.in);
        System.out.println("Please enter the price of the meal");
        double price = meal.nextDouble();
        System.out.println("Please enter the tip percentage");
        double tipPercent = meal.nextDouble();
        double tip = (price * tipPercent/100);
        System.out.println("Please enter the tax");
        double taxPercent = meal.nextDouble();
        double tax = (price * taxPercent/100);
        double totalPrice = (price + tax + tip);
        System.out.println("Your total is " + Math.round(totalPrice));
    }

}
