package data;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int productionYear;

    public Car(String brand, String model, String color, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getProductionYear() == car.getProductionYear() &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getColor(), getProductionYear());
    }

    @Override
    public String toString() {
        return "Car " +
                "brand " + brand + '\'' +
                ", model " + model + '\'' +
                ", color " + color + '\'' +
                ", productionYear " + productionYear;
    }

}
