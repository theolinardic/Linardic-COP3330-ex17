/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 17 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex17;
import java.util.Scanner;

public class ex17 {
    public static void main( String[] args )
    {
        int gender = 0, alcoholConsumed = 0, userWeight = 0, hoursSinceLastDrink = 0;
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter a 1 if you are a male or a 2 if you are female: ");
        while(true){
            if(userInputScanner.hasNextInt()){
                gender = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter valid input.\nEnter a 1 if you are a male or a 2 if you are a female: ");
                userInputScanner.next();
            }
        }

        System.out.print("How many ounces of alcohol did you have? ");
        while(true){
            if(userInputScanner.hasNextInt()){
                alcoholConsumed = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter a valid input.\nHow many ounces of alcohol did you have? ");
                userInputScanner.next();
            }
        }

        System.out.print("What is your weight, in pounds? ");
        while(true){
            if(userInputScanner.hasNextInt()){
                userWeight = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter a valid input.\nWhat is your weight, in pounds? ");
                userInputScanner.next();
            }
        }

        System.out.print("How many hours has it been since your last drink? ");
        while(true){
            if(userInputScanner.hasNextInt()){
                hoursSinceLastDrink = userInputScanner.nextInt();
                break;
            }
            else{
                System.out.print("Please enter a valid input.\nHow many hours has it been since your last drink? ");
                userInputScanner.next();
            }
        }


        double userBac = (alcoholConsumed * 5.14/userWeight * (gender==1 ? 0.73 : 0.66) - (0.015 * hoursSinceLastDrink));

        System.out.println("Your BAC is " + userBac + "\n" + (userBac>=0.08 ? "It is not legal for you to drive." : "It is legal for you to drive."));
    }
}
