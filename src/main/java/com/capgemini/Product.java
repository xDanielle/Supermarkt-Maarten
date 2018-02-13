package com.capgemini;

public class Product {

    //Variabelen
    private String name;
    private double priceProduct;

    //Constructor

    public Product(String name, double priceProduct) {
        this.name = name;
        this.priceProduct = priceProduct;
    }

    //Getters and setters

    public String getNameProduct() {
        return name;
    }

    public void setNameProduct(String nameProduct) {
        this.name = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
}
