/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.Scanner;



public class e15 {
    public static void main(String[] args) {

        String Pw = "abc$123";

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password?");
        String password = scan.nextLine();


        if (Pw.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");

        }
    }
}