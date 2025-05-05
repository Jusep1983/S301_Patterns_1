package level2.model;

import level2.interfaces.Address;

public class SpainAddress implements Address {
    private String street;
    private String number;
    private String city;
    private String postalCode;

    public SpainAddress(String street, String number, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return "Calle " + this.street + " " + this.number + ", " + this.city + " " + this.postalCode + ", España";
    }

}
