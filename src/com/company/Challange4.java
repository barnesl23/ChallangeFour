package com.company;

public class Challange4 {

    public static void main(String[] args) { //main
        //call all my functions
                int bill1=38;
                int bill2=40;
                int bill3=30;
                double subtot;
                double tip;
                double tax;
                subtot=subtotal(bill1, bill2, bill3);
                tax(subtot);
                tip(subtot);
                total(subtot);
            }
                // Calculate total owed, assuming 8% tax / 15% tip
                public static double subtotal(int bill1, int bill2, int bill3) {
                    System.out.println("subtotal "+(bill1+ bill2+bill3));
                    return (bill1+bill2+bill3);
                }
                public static void tax(double sub) {
                     System.out.println("tax "+(sub*0.08));
    }
                public static void tip(double sub) {
                     System.out.println("tip" +(sub*0.15));

    }
                public static void total(double sub) {
                    System.out.println("subtotal+tip+tax");
                }

            }




