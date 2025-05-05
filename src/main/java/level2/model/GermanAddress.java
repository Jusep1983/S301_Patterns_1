package level2.model;

import level2.interfaces.Address;

public class GermanAddress implements Address {
    private String street;
    private String number;
    private String city;
    private String postalCode;

    public GermanAddress(String street, String number, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return this.street + "straße " + this.number + ", " + this.city + " " + this.postalCode + ", " + "Deutschland";
    }

}
