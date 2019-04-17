package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = keyboard.nextLine();
        System.out.print("Enter your Address");
       int houseNumber = keyboard.nextInt();
       String street = keyboard.nextLine();
        System.out.print(houseNumber);
        System.out.print(street + " ");
        System.out.print("My Name is " + name);


    }
}
