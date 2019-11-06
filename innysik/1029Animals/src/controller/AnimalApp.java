package controller;

import data.Animal;
import data.DomesticAnimal;
import data.WildAnimal;

public class AnimalApp {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Tiger", 3, "black-orange");
        Animal animal2 = new Animal("Elephant", 5, "gray");

        Animal animal3 = new DomesticAnimal("Dog", 2, "brawn", "Max", "Nick"); // we use the second constructor of the class
        DomesticAnimal animal4 = new DomesticAnimal("Cat", 7, "white");  // we use the first constructor of class DomesticAnimal

        Animal animal5 = new WildAnimal("Deer", 15, "brawn", "forest", 500000);
        WildAnimal animal6 = new WildAnimal("Leopard", 10, "black", "jungle", 10000);

        animal4.setNickName("Murzik");

        animal1.run();  // this wild animal belongs to class Animal (where we have "runs")
        animal4.play();
        animal4.run();
        ((DomesticAnimal) animal3).play();
        animal6.migration();
        animal6.run(); // this wild animal belongs to class WildAnimal (where we have "runs fast")
        animal3.run();
    }
}
