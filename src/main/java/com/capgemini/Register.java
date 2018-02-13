package com.capgemini;

import java.util.ArrayList;

public class Register implements IRegister {


    public void initialize(ArrayList<Product> allProducts) {

    }

    public void checkOut(Customer customer){
        customer.greetCustomer();
    }

    /**
     * Calculate the total price.
     */
    public int calculateTotalPrice(ArrayList<Product> basket) {
        return 0;
    }


    /**
     * In this function the offers need to be taken into account
     * @return the price the customer will have to pay
     */
    public int calculateDiscount(ArrayList basket, Offer offer) {
        return 0;
    }

    /**
     * Calculate the end price that will be shown on the screen
     */
    public void calculateEndPrice(int TotalPrice, int Discount) {

    }
}
