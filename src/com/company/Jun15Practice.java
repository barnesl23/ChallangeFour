package com.company;
import java.util.Scanner;
public class Jun15Practice {
    public static Scanner Typing = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Say something!");
        String SentenceOne= Typing.nextLine();
        double doubly1 = Math.exp(23.98);
        double doubly2 = Math.sin(doubly1);
        double doubly3 = Math.sqrt(doubly2)*3.798;
        int num1= 63;
        int num2= num1*(int)doubly3;
        String Variables = "Practice June 15th";
        System.out.printf("%20.16s \n %8.4f \n %8.4f \n %8.4f", Variables, doubly1, doubly2, doubly3);
        System.out.println(SentenceOne);
    }
}
