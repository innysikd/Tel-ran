package controller;

import data.Address;
import data.Cinema;
import data.Genre;
import data.Schedule;

public class CinemaApp {

    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Thalia");
        Cinema cinema2 = new Cinema("Star", new Address("Hauptstr.", 56)); //one way: constructor address declared inside
        Address address = new Address("Berlinersrt.",  18); //the other way. we declare the address first
        Cinema cinema3 = new Cinema("Astra", address);
        Cinema cinema4 = new Cinema("Space");

        System.out.println(cinema1);
        System.out.println(cinema4);
        System.out.println(cinema2);

        cinema2.getAddress().setStreet("Friedrichstr.");  //to change the existing address
        cinema2.getAddress().setHouseNumber(34);

        cinema4.setAddress(new Address("Wasserstr.", 6));
        System.out.println(cinema4);
        System.out.println(cinema2);

        cinema1.setAddress(address); // we assign to cinema1 the created above address
        System.out.println(cinema1);

        System.out.println("-------");

        System.out.println(cinema1.getName());
        Schedule.getScheduleByGenre(Genre.ACTION);
        Schedule.getScheduleByGenre(Genre.COMEDY);

    }

}
