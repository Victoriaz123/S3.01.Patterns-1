public class USAAddress implements Address {

    private String street, city, state, postalCode;

    public USAAddress(String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return street + ", " + city + ", " + state + " " + postalCode+ ", USA";
    }
}


