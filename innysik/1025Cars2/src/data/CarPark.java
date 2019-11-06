package data;

import java.sql.SQLOutput;

public class CarPark {

    private Car[] cars;
    int size;

    public CarPark (int capacity){   // this Constructor makes a new array
        cars = new Car[capacity];   // the whole capacity
        size = 0;                   // the actual size
    }

    public int getSize (){
        return size;
    }

 /*   public void addCar (Car car){
        if(size < cars.length){
        cars[size] = car;
        size ++;
        }
    }
 */

    public boolean addCar (Car car){   // this method should be boolean. this way we get error, when we are out of the size
        if(size < cars.length) {
            cars[size] = car;
            size++;
            return true;
        }
        return false;
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

    public void searchByColor (String color){
        boolean flag = false;
        for (int i = 0; i<size; i++){
            if (cars[i].getColor().equalsIgnoreCase(color)){
                System.out.println(cars[i]);
                flag = true;
            }
            }
        if (!flag) {
            System.out.println("Sorry, no such color");
        }
    }

    public int getNewestCar (){
        int newestCar = cars[0].getProductionYear();   // we declare that the first car is the newest
        for (int i = 1; i < size; i++){
            if (newestCar < cars[i].getProductionYear())
                newestCar = cars[i].getProductionYear();
        }
        return newestCar;
    }

    public int getBrandCount (String brand){
        int count = 0;
        for (int i = 0; i < size; i++){
            if (cars[i].getBrand().equalsIgnoreCase(brand)){
                count ++;
            }
        }
        System.out.println("We have " + count + " " + brand);
        return count;
        }

    public void display(){
        for (int i=0; i<size; i++){
            System.out.println(cars[i]);
        }
    }

/*    public void display(){     - in this case print the whole array, also when it's not completely full
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
*/



}
