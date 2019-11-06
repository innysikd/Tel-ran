package controller;

import data.Car;
import data.CarPark;

public class CarApp {

    public static void main(String[] args) {

        Car car1 = new Car ("Renault", "Megan", "White", 2019);
        Car car2 = new Car("Ford", "Mustang", "Yellow", 2018);
        Car car3 = new Car ("Audi", "TT", "White", 2010);
        Car car4 = new Car ("Citroen", "Rosalie", "Red", 2015);
        Car car5 = new Car ("Audi", "Q3", "Metallic", 2005);

        CarPark carPark1 = new CarPark(50);
        carPark1.addCar(car1);
        carPark1.addCar(car2);
        carPark1.addCar(car3);
        carPark1.addCar(car4);
        carPark1.addCar(car5);

        carPark1.display();

        carPark1.searchByColor("yellow");

        System.out.println(carPark1.getNewestCar());

       // carPark1.deleteCar(car1);

    }
}
