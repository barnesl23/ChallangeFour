package com.company;

public class ClassWorkV2 {
    public static void main(String[] args) {

        String fullname = "Lindsey Barnes";
        int indexOf = fullname.indexOf(" ");
        String firstname = fullname.substring(0, indexOf);
        String lastName = fullname.substring(indexOf + 1) + " ";
        lastName = lastName.toUpperCase();

        String firstinit= fullname.substring(0,1) + ".";
        String diddy = "Diddy ";
        String izzle = "-izzle";


        System.out.println("Type your name, playa: " +fullname);

        System.out.println("Your gangsta name is " + '"' +firstinit+diddy+lastName+firstname+izzle +'"');


    }
}




