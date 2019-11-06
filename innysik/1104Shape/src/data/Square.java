package data;

public class Square extends Shape {

    private double size;

    public Square(Color color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return super.toString() + "Square: " + getColor() + // first we take toString from the super-class
                ", size " + size +
                ", area: " + getArea();

    }
}
