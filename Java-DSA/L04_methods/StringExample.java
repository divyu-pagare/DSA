package com.L04_methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();  //single word
//      String name = in.nextLine(); // more than 1 word
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting ="How are you?";
        return greeting;
    }
}
