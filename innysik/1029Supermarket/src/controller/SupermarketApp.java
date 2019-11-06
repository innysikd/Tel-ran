package controller;

import dao.Supermarket;
import data.MilkProduct;
import data.Product;
import data.VegetablesProduct;

import java.util.Arrays;

public class SupermarketApp {
    public static void main(String[] args) {

        MilkProduct mp1 = new MilkProduct(1233324, "Quark", 3.5, "Ja!", 3.0);
        MilkProduct mp2 = new MilkProduct(4678463, "Sauersahne", 0.9, "Almetta", 10);
        MilkProduct mp3 = new MilkProduct(4673892, "Kaese", 1.6, "Milena", 30);

        Product mp4 = new MilkProduct (1876543, "Milk", 0.5, "Ja!", 3.0);

        Product p5 = new VegetablesProduct(9845674, "Apple", 2.99, "Gold Apple", true);
        Product p6 = new VegetablesProduct(6893546, "Birne", 3.0, "Bauerhof", true);
        Product p7 = new VegetablesProduct(7903648, "Zitrone", 2.5, "Karlshof", false);
        Product p8 = new VegetablesProduct(7095643, "Gurke", 4.8, "Karlshof", true);

        Supermarket netto = new Supermarket(50);
        netto.addProduct(mp1);
        netto.addProduct(mp2);
        netto.addProduct(mp3);
        netto.addProduct(mp4);
        netto.addProduct(p5);
        netto.addProduct(p6);
        netto.addProduct(p7);
        netto.addProduct(p8);

        System.out.println("----------");
        System.out.println(netto.findByBarCode(9845674));
        System.out.println("---------");
        System.out.println(Arrays.toString(netto.findByBrand("Ja!", 5)));
        System.out.println("---------");
        netto.display();
        System.out.println("---------");
        System.out.println(netto.totalPriceOfOneBrand("ja!"));
        System.out.println("---------");
        System.out.println(Arrays.toString(netto.displayBio(5)));

        }




    }

