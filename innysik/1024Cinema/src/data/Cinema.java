package data;

import java.util.Objects;

public class Cinema {

    private String name;
    private Address address;

    public Cinema(String name) {  // constructor for the case we dont know the address
        this.name = name;
    }

    public Cinema(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(getName(), cinema.getName()) &&
                Objects.equals(getAddress(), cinema.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress());
    }

    @Override
    public String toString() {
        return "Cinema: " + name +
                ", " + address;
    }
}
