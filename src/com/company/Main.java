/*
 *  UCF COP3330 Fall 2021 Exercise 7 Solution
 *  Copyright 2021 Timothy Azinord
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length = scan.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = scan.nextInt();

        System.out.println("You entered dimensions of " + length + " feet by "+ width + " feet.");

        int area = length*width;

        System.out.println("the area is\n" +area+ " square feet");

        final double sq_meters = area/10.764;




        System.out.println(String.format("%.3f", sq_meters)+ " square meters");





    }
}
