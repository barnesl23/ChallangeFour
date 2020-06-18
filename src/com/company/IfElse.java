package com.company;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner measure = new Scanner(System.in);
        double height = measure.nextDouble();
        double weight = measure.nextDouble();
        double BMI = weight / (height * height) * 703;
        System.out.println("Your BMI is" + BMI);
        if (BMI >= 30.0) {
            System.out.println("You are obese");
        } else if (BMI >= 25.0);
        {
            System.out.println("You are overweight");
        }
        if (BMI >= 18.5) {
            System.out.println("You are normal");
        }
        if (BMI < 18.5) {
            System.out.println("You are underweight");
        }
    }
}
