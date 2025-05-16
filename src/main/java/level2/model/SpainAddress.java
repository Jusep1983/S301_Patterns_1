package level2.model;

import level2.interfaces.Address;

public class SpainAddress implements Address {
    private final String street;
    private final String number;
    private final String city;
    private final String postalCode;

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
