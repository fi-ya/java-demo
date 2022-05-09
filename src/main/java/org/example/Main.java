package org.example;

public class Main {
    public static void main(String[] args) {
        helloWorld();
        returnThree();
    }

    public static String helloWorld(){
      String result = System.out.println("Hello world!");
      return result;
//        return String; System.out.println("Hello world!");
    }

    public static int returnThree(){
        return 3;
    }
}
