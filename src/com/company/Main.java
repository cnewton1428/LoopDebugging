package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter any word");
        String userInput = kbd.nextLine();
        System.out.println(userInput);


        while (!userInput.equalsIgnoreCase("Stop")) {
            System.out.println("Enter another word: ");
            userInput = kbd.nextLine();
            System.out.println(userInput);
            System.out.println("If you want to stop type this. Type Stop");
            userInput = kbd.nextLine();
            System.out.println(userInput);
        }  System.out.println("End");
    }
}