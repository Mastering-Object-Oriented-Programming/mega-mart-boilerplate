package com.trainingmug.megamart.service;

import com.trainingmug.megamart.model.Customer;
import com.trainingmug.megamart.model.Product;
//Implementing the customerService Interface by CustomerServiceImpl Class
public class CustomerServiceImpl implements CustomerService{
    /*
    Create the following properties
    --------------------------------------------------------------
    Access Modifier           Data Type             variable
    --------------------------------------------------------------
    default                   ProductService       productService
    */


    /*
    create a no-argument constructor
     */

    /*
    create an argument constructor
     */



    //Override the buyProduct methods of Interface-CustomerService
    @Override
    public void buyProduct(Product product) {
        //print "Successfully purchased the product"
        //call displayProductDetails(product) from productService

    }
    //Override the displayCustomerDetails method of Interface-CustomerService
    @Override
    public void displayCustomerDetails(Customer customer) {
        //call displayDetails from customer

    }


}
