package com.capgemini;

public class Offer {
    private Product product;
    private int amountOfProducts;
    private int amountOfDiscount;

    //Constructor
    public Offer(Product product, int amountOfProducts, int amountOfDiscount) {
        this.product = product;
        this.amountOfProducts = amountOfProducts;
        this.amountOfDiscount = amountOfDiscount;
    }

    //Getters and setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(int amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }

    public int getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "product=" + product +
                ", amountOfProducts=" + amountOfProducts +
                ", amountOfDiscount=" + amountOfDiscount +
                '}';
    }
}
