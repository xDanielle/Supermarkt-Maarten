package com.capgemini;

public class Product {

    //Variabelen
    private String name;
    private int priceProduct;

    //Constructor

    public Product(String name, int priceProduct) {
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

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
