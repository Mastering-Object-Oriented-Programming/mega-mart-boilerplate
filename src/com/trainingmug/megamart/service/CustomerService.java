package com.trainingmug.megamart.service;

import com.trainingmug.megamart.model.Customer;
import com.trainingmug.megamart.model.Product;

public interface CustomerService {

    /*
    Declare the methods
    buyProduct(Product)
    displayCustomerDetails(Customer)
     */
    public void buyProduct(Product product);
    public void displayCustomerDetails(Customer customer);
}
