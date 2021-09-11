package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "What is the order amount? " );
        double order = input.nextDouble();
        System.out.print("What state do you live in? ");
        String state = input.next();

        if (state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String county = input.next();
            double tax;
            if (county.equals("Eau Claire")) {
                tax = order * 0.055;
            }

            if (county.equals("Dunn")) {
                tax = order * 0.054;

            }
            else {
                tax = order * 0.05;

            }
            tax = Math.round(tax * 100.0) /100.0;
            System.out.println("The tax is $" + tax + ".");
            order = order + tax;
        }

        if (state.equals("Illinois")) {
            double tax = order * 0.08;
            tax = Math.round(tax * 100.0) / 100.0;

            System.out.println("The tax is $" + tax + ".");
            order = order + tax;
        }

        System.out.println("The total is $" + order + ".");
    }
}
