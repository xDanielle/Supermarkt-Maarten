package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     * Importeren lijst van alle producten
     * @param allProducts
     */
    void initialize (ArrayList<Product> allProducts, ArrayList<Offer> offers);

     /**
     * Calculate the total price.
     */
    int calculateTotalPrice(ArrayList<Product> basket);

    /**
     * In this function the offers need to be taken into account
     * @return the price the customer will have to pay
     */

    int calculateDiscount(ArrayList<Product> basket);



    /**
     * Calculate the end price that will be shown on the screen
     */

    void calculateEndPrice(int TotalPrice, int Discount);
}
