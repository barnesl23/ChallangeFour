/*
Lindsey Barnes
 6/23/20
Pseudocode
import the Random class
Import the array
Within the main create a random titled value
Create an integer titled number and set it equal to the random with bound for the range
create a int array titled myarray and set it equal to new int[number]
create a for loop that increases i
Set myarray(i) equal to bound 95 + 5
print out Arays.toString(Myarray)
create two integers- indexOne and indexTwo
create a do while loop with index one and two in the do
make the while loop indexOne is equal to index two
swap myarray, indexOne, and indexTwo
Print a new line with Arrays.toString
create a public swtatic int swap with int[] A, int i, and int i1
create an int titled temp equal to A[i]
change value of A[i] to A[i1]
make A[i1] equal to temp
Return A
Close code with brackets
*/


package com.company;
import java.util.Random; //allows us to use random class
import java.util.Arrays; //allows us to use Arrays
public class June23 {
    public static void main(String[] args) {
        Random value = new Random(); //creates random titled value for random numbers
        int number = value.nextInt(5) + 5; //plus five says where you start and the total is the higher number
        int[] myarray = new int[number]; //defines array
        for (int i = 0; i < myarray.length; i++) { //for loop always comes after every array- defines amount
            myarray[i] = (value.nextInt(95) + 5); //5 is where you start and 100 is the higher number
        }
        System.out.println(Arrays.toString(myarray)); //prints out array for user to see
        int indexOne; //defines real numbers
        int indexTwo;
        do { //do while loop makes stuff in bracket perform only when while is true
            indexOne = value.nextInt(number);
            indexTwo = value.nextInt(number);
        } while (indexOne == indexTwo); // means that indexOne is equal to indexTwo will cause the do loop to be true
        swap(myarray, indexOne, indexTwo); //swaps order of array
        System.out.println(Arrays.toString(myarray)); //prints values for user to see
    }

    public static int[] swap(int[] A, int i, int i1) { //calling the method swap
        int temp = A[i]; //brackets mean array
        A[i] = A[i1]; //changes value
        A[i1] = temp;
        return A; //returns method
    }
}
