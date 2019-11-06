package data;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: ";
    }

    public abstract double getArea (); // this method will calculate the total area of the future shape

    public static Shape findMaxShapeByArea  (Shape[] shapes){

        Shape max = null;
        double maxArea = 0;
        for (Shape s:shapes) { // "for each" element of the array. element s of class Shape ;
            double area = s.getArea();
            if (area>maxArea){
                maxArea = area;
                max = s;
            }
        }
        System.out.println("Max area is " + maxArea);
        return max;
    }

    public static Shape[] findByColor (Shape[] shapes, String color){
        int size = 0;
        for (Shape s:shapes) {
            if (s.getColor().name().equalsIgnoreCase(color)) size++;
        }
        Shape[] shapesByColor = new Shape [size];
        int index = 0;
        for (int i = 0; i<shapes.length; i++){
            if (shapes[i].getColor().name().equalsIgnoreCase(color)) {
                shapesByColor[index] = shapes[i];
                index++;
            }

        }
        return shapesByColor;
    }

    public static Shape[] shapesByClass (Shape[] shapes, String shape) {
        int size = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equalsIgnoreCase(shape)) size++;
        }
        if (size < 1){
            System.out.println("Not found");
        return null;
         }
        Shape[] shapes1 = new Shape [size];
        int index = 0;
        for (int i = 0; i<shapes.length; i++){
            if (shapes[i].getClass().getSimpleName().equalsIgnoreCase(shape)) {
                shapes1[index] = shapes[i];
                index++;
            }
        }
        return shapes1;

    }


}





