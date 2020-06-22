/*
Lindsey Barnes
 6/17/20
Pseudocode
Import scanner
Within public static void main create the scanner and name it input by setting it equal to new Scanner(System.in)
create integer T
Create String Word
Create a do while loop that asks the user how many words they want to process between 1-10
put the integer T in and set it equal to the scanner allowing the user to input number or words
make the while T>=2 or T<=10
create a for loop where i = 1; i <= T; i++
create another do loop that asks the user what words they want to process
put the string word after and set it equal to the scanner
make the while the word length is more than 2 and less than 10000
call your method and name it scramble
create a public static String and call the method
create a new string title newEvenWord
Create a for loop which calls every other number from index 0 (all of the even numbers)
Create a char calling all the even letters
set newEvenWord equal to the same story plus letter
Create a newOddWord String
create a for loop calling all of the odd numbers by starting at index 1 and calling every other letters
create a char value calling word.charAt(odd)
change the value of newOddWord by adding it to letter
using the return method, adding newEvenWord to newOddWord
*/

package com.company;
import java.util.Scanner; //adding the scanner
public class String_Challenge {
    public static void main(String[] args) { // ask user how many words they want and the words themselves
        Scanner input = new Scanner(System.in); //naming the scanner input
        int T; //crete an integer for the number of words
        String word; //create a string for the words themselves
                    do { //create a do while loop which makes only allows to precede if the user enters a valid numbers of words
                        System.out.println("How many words do you want to process in between 1-10?");
                        T = input.nextInt(); //scanner allows user to answer question
            } while (T<1 || T>= 10); //sets the valid range of numbers, if range is invalid question repeats
                 for (int i = 1; i <= T; i++) { //create a for loop repeating until reaching the value of numbers entered
                     do { //create another do while loop allowing the user to precede if they type in a valid range of letters
                         System.out.println("What are the words you want to process?");
                         word = input.next(); //scanner allows user to answer question
                     } while (word.length()<2 || word.length()>=10000); //creates a range of numbers that is valid
            String dividedWord = scramble(word); //creates method titled scramble
            System.out.println(dividedWord); //prints the final answer
        }
    }
        public static String scramble(String word){ //calls the return method
        String newEvenWord = ""; //create a new string for the even letters
        for (int even = 0; even < word.length(); even += 2) { //call all of the even letters by starting at zero and calling every other letter
            char letter = word.charAt(even); //call all of the even letters
            newEvenWord = newEvenWord + letter; //rename value of newEvenWord
        }
        String newOddWord = ""; //create new string variable for odd letters
        for (int odd = 1; odd < word.length(); odd += 2) { //call all of the odd letters by starting at index one and listing every other letter
            char letter = word.charAt(odd); //create a char letter
            newOddWord = newOddWord + letter;//rename value of newOddWord
        }
        return newEvenWord + " " + newOddWord; //return the string variables by putting even letters space odd words
        }
}
