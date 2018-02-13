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

        //maak nieuwe producten
        Product Robijn = new Product("Robijn", 3);
        Product Brinta = new Product("Brinta",2);
        Product ChineseGroenten = new Product("Chinese Groenten", 5);
        Product Kwark = new Product("Kwark", 2);
        Product Luiers = new Product("Luiers", 10);

        ArrayList<Product> basket = new ArrayList<Product>();

        //VikkieVast wordt gegroet

        // Regular klant Vikkie gaat winkelen
        VikkieVast.addToBasket(Robijn);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(Kwark);
        VikkieVast.addToBasket(Luiers);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(ChineseGroenten);

        //maak de offers
        Offer offerRobijn = new Offer(Robijn, 3, 2);
        Offer offerBrinta = new Offer(Brinta, 2, 1);
        Offer offerLuiers = new Offer(Luiers, 4, 10);

        //maak arraylist van offers en voeg de 3 aangemaakte offers toe
        ArrayList<Offer> offers = new ArrayList<Offer>();
        offers.add(offerRobijn);
        offers.add(offerBrinta);
        offers.add(offerLuiers);

        //Je aangemaakte register 'myRegister' wordt uitgevoerd met de methode checkOut en je stuurt de customer mee die moet afrekenen
        //De customer bevat een product lijst die heet basket en daar gaat de register iets mee doen.
        myRegister.checkOut(VikkieVast);




























    }
}
