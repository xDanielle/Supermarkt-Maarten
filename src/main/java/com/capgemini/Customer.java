package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    /**
     * Declare the variables first name, last name and the amount of products that the customer has picked up
     */
    private String firstName;
    private String lastName;
    private boolean regular;
    private ArrayList productList;
    private Basket basket;
    private Product product;

    /**
     * The first and last name of the customer needs to be known
     * @param firstName first name
     * @param lastName last name
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * The customer needs to be greeted
     */
    public abstract void greetCustomer(String firstName, String lastName, boolean regular);

    /**
     * Customer gets basket
     */
    public ArrayList generateBasket(){
        ArrayList<Basket> productList = new ArrayList<Basket>();
        return productList;
    }

    /**
     * These functions stand for every time a customer picks up a new product. For example, when the customer picks
     * up a new product B, the amount of product B's need to be added by one.
     * @return the amount of products the customer has in his/her basket
     */
    public abstract ArrayList addToBasket(ArrayList productList,Product product);

    //Getters and setters
    public ArrayList getProductList() {
        return productList;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
    }
}
