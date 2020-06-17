package com.company;
import java.util.Scanner;
public class Peter_And_his_friends {
    public static Scanner Typing = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Say something!");
        String SentenceOne= Typing.nextLine();
        Search(SentenceOne);
    }

    public static void Search(String SentenceOne) {
        int end = SentenceOne.indexOf(" ");
        char letter = ' ';
        String firstWord = SentenceOne.substring(0, end + 1);
        int count = 0;
        for (int i = 0; i < firstWord.length(); i++) {

            letter = firstWord.charAt(i);
            if (letter != ' ') ;
            count++;
            String temp = SentenceOne.substring(i + 1);
            int indexOf = temp.indexOf(letter);
            while (indexOf >= 0) {
                count++;
                temp = temp.substring(indexOf + 1);
                indexOf = temp.indexOf(letter);
            }
            firstWord = firstWord.replace(letter, ' ');
            System.out.println(letter + " = " + count);
            count = 0;
        }
    }
}
