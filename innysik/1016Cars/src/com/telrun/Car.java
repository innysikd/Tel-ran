package com.telrun;

public class Car {

    String color;
    String model;
    int productionYears;


    public static void displayCar (Car car){
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.productionYears);
    }

    public static Car getOldestCar(Car cars[]){
        Car oldestCar = cars[0];

        for (int i = 0; i<cars.length -1; i++){
            if (oldestCar.productionYears >cars[i+1].productionYears){
                oldestCar = cars[i+1];
            }

        }
        return oldestCar;
    }

    public static void printArray(Car[] cars){
        for (Car car:cars) {
            car.displayCar(car);
        }
    }

/*   this method is not correct - doesn't work when user enters a non-existing model

        public static Car findByModel (Car cars [], String model){
        Car car1 = cars [0];
        for (int i = 0; i < cars.length; i++){
            if (cars[i].model.equalsIgnoreCase(model)){
                return cars [i];
            }
            else{
                System.out.println("No such car");
            }
        }
        return car1;
    }
 */
    public static void searchByModel (Car cars [], String model){
        int count = 0;
        for (int i = 0; i < cars.length; i++){
            if (cars[i].model.equalsIgnoreCase(model)){
                displayCar(cars[i]);
                count++;
            }
            }
        if (count == 0){
            System.out.println("No such model");
        }
        }


}
