package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
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
