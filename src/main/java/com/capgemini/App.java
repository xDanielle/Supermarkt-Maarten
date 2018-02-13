package com.capgemini;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //genereer register
        Register myRegister = new Register();

        //genereer nieuwe klanten
        Customer VikkieVast = new ReturningCustomer("Vikkie", "Vast");
        Customer LosseFlodder = new NewCustomer("Mevrouw", "Flodder");

        //genereer nieuwe producten
        Product Robijn = new Product("Robijn", 3);
        Product Brinta = new Product("Brinta",2);
        Product ChineseGroenten = new Product("Chinese Groenten", 5);
        Product Kwark = new Product("Kwark", 2);
        Product Luiers = new Product("Luiers", 10);

        ArrayList<Product> basket = new ArrayList<Product>();

        //genereer de offers
        // offer aanbieding1 = new offer(Robijn, hoeveelheidproducten 3, 2 korting
        // offer aanbieding2 = new offer(Brinta, hoeveelheidproducten 2, 1 korting
        // offer aanbieding3 = new offer(Luiers, hoeveelheidproducten 4, 10 korting



        // Regular klant Vikkie gaat winkelen
        VikkieVast.addToBasket(Robijn);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(Kwark);
        VikkieVast.addToBasket(Luiers);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(ChineseGroenten);






















    }
}
