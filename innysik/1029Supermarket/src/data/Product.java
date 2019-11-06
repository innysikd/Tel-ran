package data;

import java.util.Objects;

public class Product {

    private long barCode;
    private String name;
    private double price;
    private String brand;

    public Product(long barCode, String name, double price, String brand) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.brand = brand;

    }

    public Product (){}  //empty constructor, so that we can create also an object of this class without defining it's field

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getBarCode() == product.getBarCode() &&
                Double.compare(product.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getBrand(), product.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBarCode(), getName(), getPrice(), getBrand());
    }

    @Override
    public String toString() {
        return "Product " +
                "barCode " + barCode +
                ", name " + name +
                ", price " + price +
                ", brand " + brand;
    }
}
