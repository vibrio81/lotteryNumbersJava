package com.tts;

import java.util.*;


public class Main {

    public static void main(String[] args) {



        System.out.println("Hello World");

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);

        //interactive portion
        System.out.print("Shall we play a game?");
        System.out.print("  Y/N: ");


        String Response = input.nextLine();
        if (Response.equals("y")) {
            System.out.println("Lets continue");
        }
          else  if (Response.equals("Y")){
            System.out.println("Lets continue");
        }
        else if (Response.equals("yes")){
            System.out.println("Lets continue");
        }
        else {
            System.out.println("See you later");
            input.close();
        }



        Scanner info = new Scanner(System.in);

        //Questions
        System.out.println("Do you drive a red car");
        System.out.print("  Y/N: ");
        String questions = info.nextLine();
        if (questions.equals("y")) {
            System.out.println("Lucky");
        }
        else if (questions.equals("Y")) {
            System.out.println("Lucky");
        }
        else if (questions.equals("yes")) {
            System.out.println("Lucky");
        }
        else {
            System.out.println("How lame");
        }
        System.out.println("What is the name of your favorite pet?");
        String petName = info.nextLine();
        System.out.println(petName + "  is such a cute name!");
        System.out.println("How old is your pet?");
        String petAge = info.nextLine();

        System.out.println("What is your favorite number?");
        String favNum = info.nextLine();
        System.out.println(favNum + " ,good choice");

        System.out.println("What is two-digit model year of their car?");
        String carYr = info.nextLine();



        System.out.println("Do you have a favorite athlete?");
        System.out.print("  Y/N: ");
        String athlete = info.nextLine();
        if (athlete.equals("y")) {
            System.out.println("What is their number?");
            String sportNum = info.nextLine();
        }
        if (athlete.equals("Y")) {
            System.out.println("What is their number?");
            String sportNum = info.nextLine();
        }
        if (athlete.equals("N")) {
            System.out.println("That's okay.");
            String sportNum = info.nextLine();


        }
        else {
            System.out.println("");
        }

        System.out.println("What is the name of your favorite actor?");
        String actorName = info.nextLine();
        System.out.println("I like " + actorName + " too!");

        System.out.println("Enter a random number from 1 to 50");
        String rando = info.nextLine();
        System.out.println();


        //make a lottery number generator
        System.out.println("Do you want a lottery number?");
        System.out.print("  Y/N: ");
        String lotto = info.nextLine();
        if (lotto.equals("y")) {
            System.out.println("Okay, lets go");
            RandomNumber.printLottoNumber();
        } else {
            System.out.println("ok bye");
        }


    }
}


