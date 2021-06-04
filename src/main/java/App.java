/*
What is your current age? 25
        At what age would you like to retire? 65
        You have 40 years left until you can retire.
        It's 2015, so you can retire in 2055.

*/

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Luis Andres Acosta Mejia
 */


import java.util.*; //Used to import the scanner Method

import java.util.Date; //Used to import the current date
public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here we are calling the scanner method from the library
        Date d = new Date(); //Here we are calling the Date method from the library; so we can have the date

        //Here we are defining the variables that are going to be used in the program.
        String age;
        String retire;
        int myage;
        int myretire;

        //Here we are getting the year by calling the reference d.getYear()
        int year = d.getYear();
        int current_year= year + 1900; //We need to add 1900, so we can update to the current year.

        System.out.print("What is your current age? ");
        age = in.next(); //Input of your age

        System.out.print("At what age would you like to retire? ");
        retire = in.next(); //Input of the age you would like to retire

        myage = Integer.parseInt(age); //Here we are converting from string to int and passing the value
        myretire = Integer.parseInt(retire); //Here we are converting from string to int and passing the value

        //So, we can substracti retire - age; and the difference is the time left until you retire and we print the result
        System.out.println("You have " + (myretire - myage) + " years left until you can retire");

        //Then we can print the current year, and we can add the current year to the substraction of (retire - age); then, it will give you the year that you are going to retire.
        System.out.println("It's " + current_year + ", so you can retire in " + (current_year +(myretire - myage)) + ".");
    }
}
