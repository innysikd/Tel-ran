public class Cinema {

    private String cinemaName;
    private Address [] addresses;

    public Cinema(String cinemaName, Address[] addresses) {
        this.cinemaName = cinemaName;
        this.addresses = addresses;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }
}
