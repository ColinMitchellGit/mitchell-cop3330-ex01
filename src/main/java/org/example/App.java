package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("What is your name? ");
        Scanner name = new Scanner(System.in);

        System.out.println("Hello, " + name.nextLine() + ", nice to meet you!");
    }
}
