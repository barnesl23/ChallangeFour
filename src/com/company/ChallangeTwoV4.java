package com.company;

public class ChallangeTwoV4 {

    public static void main(String[] args) { //main
        //call all my functions
        line();
        top();
        bottom();
        line();
    }

    public static void line() {
        System.out.print("#");
        for (int dash = 0; dash < 16; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                System.out.print(" ");

            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
        public static void bottom() {
            for (int line = 4; line >= 1; line--) {
                System.out.print("|");
                for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                    System.out.print(" ");

                }
                System.out.print("<>");
                for (int dots = 1; dots <= 4 * line - 4; dots++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int spaces = 1; spaces <= -2 * line + 8; spaces++) {
                    System.out.print(" ");
                }
                System.out.println("|");


            }
        }
    }



