package com.company;

public class GangstaName{
    public static void main(String[] args) {
        sayHi("Marty");
        String name = "8";
        sayHi(name);
        String teacher = "Lindsey Barnes";
        System.out.println();
        //sayHi(teacher);
        Challange3V1.line();
    }

    public static void sayHi(String name) {
        System.out.println("This name is " + name.length() + "characters long");
        System.out.println("Hello " + name);
        int index0f = name.indexOf("S");
        System.out.println("The index of S is = " + index0f);
        if (index0f > 0) {
            String lastName = name.substring(index0f);
            System.out.println("The lastName = " + lastName);
        }
        if (name.length() > 4) {
            char letter;
            letter = name.charAt(4);
            System.out.println("The character =" + letter);
        }
    }
}