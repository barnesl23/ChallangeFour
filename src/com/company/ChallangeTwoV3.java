package com.company;

public class ChallangeTwoV3 {

    public static void main(String[] args) { //main
        //call all my functions
        line();
        top();
        bottom();
        line();
    }

        public static void line() {
            System.out.println("#================#");
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
