package controller;

import data.*;

import java.util.Arrays;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(Color.RED, 10, 5);
        Rectangle rec2 = new Rectangle(Color.YELLOW, 230, 45);
        Rectangle rec3 = new Rectangle(Color.BLACK, 128, 38);

        Circle circ1 = new Circle(Color.GREEN, 65);
        Circle circ2 = new Circle(Color.BLUE, 14);
        Circle circ3 = new Circle(Color.YELLOW, 78);

        Square sq1 = new Square(Color.RED, 98);
        Square sq2 = new Square(Color.BLACK, 68);
        Square sq3 = new Square(Color.RED, 780);

        Shape[] shapes = {rec1, rec2, rec3, circ1, circ2, circ3, sq1, sq2, sq3};

     //   printArrayElements(shapes);

        System.out.println(Shape.findMaxShapeByArea(shapes));
        printArrayElements(Shape.findByColor(shapes, "red"));
        System.out.println(Arrays.toString(Shape.shapesByClass(shapes, "square")));

    }


    static void printArrayElements(Object[] objects) {   //universal method to print any array
        for (Object o : objects) {
            System.out.println(o);
        }

    }

}
