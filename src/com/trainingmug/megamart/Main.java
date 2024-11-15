package com.trainingmug.megamart;

//import all the required packages



//import Scanner class to read input from console
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create the productService object


        //create the customerService object passing productService as argument


        //Create some dummy Product objects using no arg constructor and set the properties using setters methods


        //Create a dummy Camera Object using argument constructor


        //create a dummy laptop object using argument constructor


        //Create dummy Customer Object using argument constructor


        //Create dummy RegularCustomer Object using argument constructor


        //create dummy PremiumCustomer Object using argument constructor


        /*
        Declare the scanner object to take input (from Scanner - class)
         */


        //call displayMainMenu() method from Menu class



        //Take input from user and store it in the variable (input)


        //Use switch case condition method to interact as per user "input"

        switch ( ){
            case 1:
                //Call the displayCustomerDetails to print  the customer details

                break;
            case 2:
                //call the displayCustomerDetails to print the regular customer details

                break;
            case 3:
                //call the displayCustomerDetails to print the premium customer details

                break;
            case 4:
                //call the displayAllProducts to print all products

                break;
            case 5:
                //call the displayProductDetails to print the product details

                break;
            case 6:
                //call the buyProduct to purchase

                break;
            default:
                //Here is the default
                System.out.println("Invalid Input ..");

        }
    }
}
