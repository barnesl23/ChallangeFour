/*Lindsey Barnes
 6/16/20
Pseudocode
On the top of the screen type  import java.util.Scanner
Create public class titled June16th
Create a public static void titled main
Create your Scanner titled message and set it equal to new Scanner(System.in)
paste the int, double, and string variable given to me in the directions
Create a System.out.println telling the user to "Please enter a phrase"
Create a new String object titled sTwo and initialize it by using message.nextLine()
Create a System.out.println telling the user to "Please enter a real number"
Define a second double variable titled dTwo and initialize it by using message.nextDouble()
Create a System.out.println telling the user to "Please enter an integer"
Define a second int variable titled iTwo and initialize it by using message.nextInt()
Create a System.out.println
 */
package com.company;
import java.util.Scanner;
public class June16th {
public static void main(String [] args) {
    Scanner message = new Scanner(System.in);
    int i = 4;
    double d = 4.0;
    String s = "Greenhill";
    System.out.println("Please enter a phrase");
    String sTwo = message.nextLine();
    System.out.println("Please enter a real number");
    double dTwo = message.nextDouble();
    System.out.println("Please enter an integer");
    int iTwo = message.nextInt();

    System.out.println(i + iTwo);
    System.out.println(d + dTwo);
    System.out.println(s + sTwo);
}
}
