package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    void initialize(ArrayList<Product> allProducts = new ArrayList<Product>());

    /**
     * Calculate the total price.
     */
    int calculateTotalPrice(ArrayList basket, Product product);

    /**
     * In this function the offers need to be taken into account
     * @return the price the customer will have to pay
     */

    int calculateDiscount(ArrayList basket, Offer offer);

    /**
     * Calculate the end price that will be shown on the screen
     */

    void calculateEndPrice(double TotalPrice, double Discount);
}
