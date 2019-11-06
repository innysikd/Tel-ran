package com.telrun;

import java.util.Scanner;

import static com.telrun.Car.*;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car();
	Car car2 = new Car();
	Car car3 = new Car();

	car1.model = "BMW";
	car1.color = "black";
	car1.productionYears = 2017;

	car2.model = "Opel";
	car2.color = "white";
	car2.productionYears = 2001;

	car3.model = "Citroen";
	car3.color = "red";
	car3.productionYears = 1965;

	Car [] cars =  new Car[3];
	cars[0] = car1;
	cars[1] = car2;
	cars[2] = car3;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter model name");
		String userModel = scanner.nextLine();

//		displayCar(findByModel(cars, userModel);

		searchByModel(cars, userModel);


/*	printArray(cars);
	System.out.println();
	displayCar(getOldestCar(cars));
*/


    }
}
