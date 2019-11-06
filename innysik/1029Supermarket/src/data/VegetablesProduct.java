package data;

import java.util.Objects;

public class VegetablesProduct extends Product {

    private boolean bio;

    public VegetablesProduct(long barCode, String name, double price, String brand) {
        super(barCode, name, price, brand);
    }

    public VegetablesProduct(boolean bio) {
        this.bio = bio;
    }

    public VegetablesProduct(long barCode, String name, double price, String brand, boolean bio) {
        super(barCode, name, price, brand);
        this.bio = bio;
    }


    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VegetablesProduct)) return false;
        if (!super.equals(o)) return false;
        VegetablesProduct that = (VegetablesProduct) o;
        return isBio() == that.isBio();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isBio());
    }

    @Override
    public String toString() {
        return "VegetablesProduct " +
                "bio " + bio +
                 super.toString();
    }
}
