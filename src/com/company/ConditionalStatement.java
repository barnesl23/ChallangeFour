package com.company;
import java.util.Random;
import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        String answer;
        int n;
        do {
            n = rand.nextInt(137) + 1;
            System.out.println(n);
            System.out.println("Do you want to continue?");
            answer = keyboard.next();
        }
        while (answer.contains("Y") || answer.contains("y"));
        solve (n);
    }
    public static void solve(int n) {
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n <= 6) {
            System.out.println("Not Weird");
        } else if (n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }

    }
}






