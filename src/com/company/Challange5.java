package com.company;

public class Challange5 {

    public static void main(String[] args) {
        int limit = 5;
        for (limit = 5; limit >= 0; limit--)  {


            char letter = 65;
            for (int top = 0; top <= limit; top++) {

                System.out.print((char) (letter + top) + " ");
            }
            System.out.println(' ');

        }
        for (limit = 1; limit <= 5; limit++)  {
            char letter = 65;
            for (int top = 0; top <= limit; top++) {

                System.out.print((char) (letter + top) + " ");
            }
            System.out.println(' ');

        }
    }


}
    
        //call all my functions




