package com.company;

import apple.laf.JRSUIConstants;

public class Challange3V1 {
public static final int size=5;
    public static void main(String[] args) { //main
        //call all my functions
        line();
        top1();
        bottom1();
        line();
        bottom1();
        top1();
        line();
    }

    public static void line() {
        System.out.print("+");
        for (int dash = 1; dash <=2*size+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top1() {
        for (int bar = 1; bar <=size; bar++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -1 * bar + size + 1; spaces++) {
                System.out.print(" ");

            }
            for (int lslant = 1; lslant <= 1 * bar -1; lslant++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int rslant = 1; rslant <= 1 * bar -1; rslant++) {
                System.out.print("\\");
            }

            for (int spaces = 1; spaces <= -1 * bar + size + 1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

        public static void bottom1() {
            for (int bar = 1; bar <=size; bar++) {
                System.out.print("|");
                for (int spaces = 1; spaces <= bar; spaces++) {
                    System.out.print(" ");

                }
                for (int rslant = 1; rslant <= -1 * bar + size; rslant++) {
                    System.out.print("\\");
                }
                System.out.print("*");

                for (int lslant = 1; lslant <= -1 * bar + size; lslant++) {
                    System.out.print("/");
                }

                for (int spaces = 1; spaces <= bar; spaces++) {
                    System.out.print(" ");
                }
                System.out.println("|");


            }
        }
    }




