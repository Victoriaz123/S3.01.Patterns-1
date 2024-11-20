public class SpainAddress implements Address{

    private String street, city, province, postalCode;

    public SpainAddress(String street, String city, String province, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return street + ", " + city + ", " + province + " " + postalCode+ ", Spain";
    }
}


