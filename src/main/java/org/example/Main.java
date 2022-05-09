package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        helloWorld();
//        returnThree();
//        reverseString("hello");
//        readInput();
//        fizzBuzz();
        fizzBuzzPrint();


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

    public static void fizzBuzz() {
        //  to read data from terminal
        Scanner scanner = new Scanner(System.in);
        //   message for user to enter number;
        System.out.print("Number: ");
        // read the number
        int number = scanner.nextInt();

        if (number % 15 == 0 )
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }

    public static void fizzBuzzPrint() {

        int n = 100;

        for (int i=1; i<=n; i++){
            if (i % 15 == 0 )
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Fizz");
            else if (i % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
