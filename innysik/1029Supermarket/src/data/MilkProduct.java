package data;

import java.util.Objects;

public class MilkProduct extends Product {

    private double fatPercent;

    public MilkProduct(long barCode, String name, double price, String brand, double fatPercent) {
        super(barCode, name, price, brand);
        this.fatPercent = fatPercent;
    }

    public MilkProduct (double fatPercent){
        super();
        this.fatPercent = fatPercent;
    }

    public MilkProduct(){
        super();
    }

    public double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(double fatPercent) {
        this.fatPercent = fatPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilkProduct)) return false;
        if (!super.equals(o)) return false;
        MilkProduct that = (MilkProduct) o;
        return Double.compare(that.getFatPercent(), getFatPercent()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFatPercent());
    }

    @Override
    public String toString() {
        return "MilkProduct " +
                "fatPercent " + fatPercent +
                 super.toString();
    }
}
