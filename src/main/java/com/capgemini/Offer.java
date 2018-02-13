package com.capgemini;

public class Offer {
    private Product product;
    private int amountOffer;
    private double priceOffer;

    //Constructor
    public Offer(Product product, int amountOffer, double priceOffer) {
        this.product = product;
        this.amountOffer = amountOffer;
        this.priceOffer = priceOffer;
    }

    //Getters and setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountOffer() {
        return amountOffer;
    }

    public void setAmountOffer(int amountOffer) {
        this.amountOffer = amountOffer;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }
}
