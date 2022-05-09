package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        helloWorld();
        returnThree();
        reverseString("hello");
        readInput();

    }

    public static String helloWorld(){
//      System.out.println("Hello world!");
//        String result = "Hello world!";
        return "Hello world!";
    }

    public static int returnThree(){
        return 3;
    }

    public static String reverseString(String args){

        return "olleh";
    }

    public static void readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String yourName = scanner.next();
        System.out.println("Your name is " + yourName);
    }
}
