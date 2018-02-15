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


        // PRODUCTEN
        // Maak nieuwe producten aan
        Product Robijn = new Product("Robijn", 3);
        Product Brinta = new Product("Brinta",2);
        Product ChineseGroenten = new Product("Chinese Groenten", 5);
        Product Kwark = new Product("Kwark", 2);
        Product Luiers = new Product("Luiers", 10);

        // Maak de arraylist voor alle producten in het assortiment
        ArrayList<Product> products = new ArrayList<Product>();
        // Voeg alle producten toe aan allProducts lijst
        products.add(Robijn);
        products.add(Brinta);
        products.add(ChineseGroenten);
        products.add(Kwark);
        products.add(Luiers);


        // Regular klant Vikkie gaat winkelen en voegt producten toe aan haar basket
        VikkieVast.addToBasket(Robijn);
        VikkieVast.addToBasket(Robijn);
        VikkieVast.addToBasket(Robijn);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(Kwark);
        VikkieVast.addToBasket(Luiers);
        VikkieVast.addToBasket(Brinta);
        VikkieVast.addToBasket(ChineseGroenten);

        // AANBIEDINGEN
        // Aanbiedingen worden aangemaakt
        Offer offerRobijn = new Offer(Robijn, 3, 2);
        Offer offerBrinta = new Offer(Brinta, 2, 1);
        Offer offerLuiers = new Offer(Luiers, 4, 10);

        //maak arraylist van offers en voeg de 3 aangemaakte offers toe
        ArrayList<Offer> offers = new ArrayList<Offer>();
        offers.add(offerRobijn);
        offers.add(offerBrinta);
        offers.add(offerLuiers);



        //Je aangemaakte register 'myRegister' wordt aangeroepen met de methode checkOut en je stuurt de customer mee die moet afrekenen
        //De customer bevat een product lijst die heet basket en daar gaat de register iets mee doen.
        myRegister.initialize(products, offers);
        myRegister.checkOut(VikkieVast);





























    }
}
