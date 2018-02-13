package com.capgemini;

import java.util.ArrayList;

public class Register implements IRegister {


    public void initialize(ArrayList<Product> allProducts) {

    }

    public void checkOut(Customer customer){
        customer.greetCustomer();
        int countPrice = calculateTotalPrice(customer.basket);
        System.out.println(countPrice);
    }

    /**
     * Calculate the total price.
     * Voor een tellertje tot size van je lijst tel alle prijzen bij elkaar op
     */
    public int calculateTotalPrice(ArrayList<Product> basket) {
        int countPrice = 0;
        for (int i = 0; i < basket.size(); i++){
            countPrice += basket.get(i).getPriceProduct();
        } return countPrice;
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
