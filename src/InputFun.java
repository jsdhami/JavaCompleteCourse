import java.io.BufferedReader;
import java.util.Scanner;
public class InputFun{
    public static void main(String[] args){
        System.out.println("This program for the Input system in java");
//this is comment section of the program
        /* this is multiline comment section this program
        there are two functions in Java Program to input the data from user
        -Scanner class
         ==> The scanner class is the latest added function in java which
         is also advanced version of BufferedReader Class. it is very easy
          to use.

         Syntax: Scanner scn = new Scanner(System.in);
         this syntax make the object for the input data
        Importing Scanner Class: To use the Scanner we need to
         import the Scanner class from the util package as


        -BufferedReader Class

         */

        System.out.println("What is your name ?");
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();
        System.out.println("Now, i know you.......... Your Name is: " +name);



    }
}
