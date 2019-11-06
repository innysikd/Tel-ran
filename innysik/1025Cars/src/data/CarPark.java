package data;

import java.sql.SQLOutput;

public class CarPark {

    private Car[] cars;
    int size;

    public CarPark (int capacity){   // this Constructor makes a new array
        cars = new Car[capacity];
        size = 0;
    }

    public int getSize (){
        return size;
    }

    public void addCar (Car car){
        if(size < cars.length){
        cars[size] = car;
        size ++;
        }
    }


    public boolean deleteCar (Car car){
        for (int i=0; i<size; i++){
            if (cars[i].equals(car)){
                cars[i] = cars[size-1];
                size--;
                System.out.println("Success. Size after " + size);
                return true;
            }
        }
        return false;
    }

/*   public void searchByColor (String color){
        boolean flag = false;
        for (int i = 0; i < size; i++){
            if (cars[i].getColor().equalsIgnoreCase(color)){
                System.out.println(cars[i]);
                flag = true;
            }
        }
        if (flag){
            System.out.println("Sorry, no such color");
        }
    }*/

    public boolean searchByColor (String color){
        int count = 0;
        for (int i = 0; i<size; i++){
            if (cars[i].getColor().equalsIgnoreCase(color)){
                System.out.println(cars[i]);
                count ++;
            }else{
                System.out.println("Sorry, no such color");
            }
        }
        return true;
    }

    public int getNewestCar (){
        int newestCar = cars[0].getProductionYear();
        for (int i = 1; i < size; i++){
            if (newestCar < cars[i].getProductionYear())
                newestCar = cars[i].getProductionYear();
        }
        return newestCar;
    }

   // public int getBrandCount (){
//}

    public void display(){
        for (int i=0; i<size; i++){
            System.out.println(cars[i]);
        }
    }








}
