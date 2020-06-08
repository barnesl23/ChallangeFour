package com.company;

public class ChallangeTwo {

    public static void main(String[] args) { //main
        //call all my functions
        line();
        top();
        bottom();
        line();
    }

        public static void line() {
        System.out.print("#");
        for(int dash=0; dash<16; dash++) {
            System.out.print("=");
        }
            System.out.print("#");
        }


        public static void top() {
            System.out.println("|      <><>      |");
            System.out.println("|    <>....<>    |");
            System.out.println("|  <>........<>  |");
            System.out.println("|<>............<>|");

        }

        public static void bottom () {
            System.out.println("|<>............<>|");
            System.out.println("|  <>........<>  |");
            System.out.println("|    <>....<>    |");
            System.out.println("|      <><>      |");
        }

    }
