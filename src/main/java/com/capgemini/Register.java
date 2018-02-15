package com.capgemini;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Register implements IRegister {

    private ArrayList<Product> allProducts = new ArrayList<Product>();
    private ArrayList<Offer> allOffers = new ArrayList<Offer>();

    // Deze methode laadt de producten bij mainapp in naar allProducts en de offers uit main naar allOffers.
    public void initialize(ArrayList<Product> allProducts, ArrayList<Offer> offers) {
        this.allProducts = allProducts;
        this.allOffers = offers;
    }


    // Dit is de hoofdmethode van deze klasse. Deze methode maakt een totalPrice door een methode aan te roepen
    // Ook maakt deze methode een int discount aan dmv de methode calculateDiscount aan te roepen.

    public void checkOut(Customer customer) {

        customer.greetCustomer();
        System.out.println("--------------------------------------");

        // Tussentotaalprijs berekenen en printen
        int firstTotalPrice = calculateTotalPrice(customer.basket);

        System.out.println("Het tussentotaal is: " + firstTotalPrice + " euro");

        // Korting berekenen
        int discount = calculateDiscount(customer.basket);

        //int finalTotalPrice = calculateEndPrice(firstTotalPrice, discount);
    }


    /**
     * Calculate the total price.
     * Voor een tellertje tot size van je lijst tel alle prijzen bij elkaar op
     */
    public int calculateTotalPrice(ArrayList<Product> basket) {
        int countPrice = 0;
        for (int i = 0; i < basket.size(); i++) {
            System.out.println("Je hebt 1 " + basket.get(i).getNameProduct() + " in je mandje gestopt");
            countPrice += basket.get(i).getPriceProduct();
        }
        return countPrice;
    }

    /**
     * In this function the offers need to be taken into account
     *
     * @return the price the customer will have to pay
     */
    public int calculateDiscount(ArrayList<Product> basket) {

        int discount = 0;


        // Voor elk product in de basket tel je 1 bij elke type op
        for (Product product : this.allProducts) {

            int counter = 0;

            for (Product basketProduct : basket) {

                if (basketProduct.equals(product)){
                    counter++;
                    System.out.println("wat doet ie heej");
                }
            }
        }

//        for (int i = 0; i < basket.size(); i++)
//            if (basket.get(i).getNameProduct() == "Robijn") {
//                System.out.println("Dit product is gelijk aan Robijn");
//                countItemRobijn += 1;
//            } else if (basket.get(i).getNameProduct() == "Brinta") {
//                System.out.println("Dit product is gelijk aan Brinta");
//                countItemBrinta += 1;
//            } else if (basket.get(i).getNameProduct() == "Chinese Groenten") {
//                System.out.println("Dit product is gelijk aan Chinese Groenten");
//                countItemChineseGroenten += 1;
//            } else if (basket.get(i).getNameProduct() == "Kwark") {
//                System.out.println("Dit product is gelijk aan Kwark");
//                countItemKwark += 1;
//            } else if (basket.get(i).getNameProduct() == "Luiers") {
//                System.out.println("Dit product is gelijk aan Luiers");
//                countItemLuiers += 1;
//            }
//        System.out.println(countItemRobijn);
//        System.out.println(countItemBrinta);
//        System.out.println(countItemChineseGroenten);
//        System.out.println(countItemKwark);
//        System.out.println(countItemLuiers);

        return discount;
    }

    /**
     * Calculate the end price that will be shown on the screen
     */
    public void calculateEndPrice(int TotalPrice, int Discount) {

    }
}
