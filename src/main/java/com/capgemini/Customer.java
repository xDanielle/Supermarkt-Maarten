package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    /**
     * Declare the variables first name, last name and the amount of products that the customer has picked up
     */
    protected String firstName;
    protected String lastName;
    // private boolean regular;
    // private ArrayList basket;
    // private Basket basket;
    private Product product;

    /**
     * The first and last name of the customer needs to be known
     *
     * @param firstName first name
     * @param lastName  last name
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * The customer needs to be greeted
     */
    public abstract void greetCustomer();

    /**
     * Customer gets basket
     * Deze methode maakt een arraylist aan van het object producten. De lijst heet basket. De methode returnt de lijst.
     */

    ArrayList<Product> basket = new ArrayList<Product>();

    /**
     * These functions stand for every time a customer picks up a new product. For example, when the customer picks
     * up a new product B, the amount of product B's need to be added by one.
     *
     * @return the amount of products the customer has in his/her basket
     */
    public void addToBasket(Product productName) {
        this.basket.add(productName);
    }


    //Getters and setters

    public ArrayList getBasket() {
        return basket;
    }

    public void setBasket(ArrayList basket) {
        this.basket = basket;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
