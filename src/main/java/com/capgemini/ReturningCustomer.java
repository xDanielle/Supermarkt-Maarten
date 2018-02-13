package com.capgemini;

import java.util.ArrayList;

public class ReturningCustomer extends Customer {

    /**
     * The first and last name of the customer needs to be known
     *
     * @param firstName first name
     * @param lastName  last name
     */
    public ReturningCustomer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void greetCustomer() {
        System.out.println("Welcome back " + super.firstName + super.lastName);

    }

}
