package level2.model;

import level2.interfaces.Address;
import level2.interfaces.PhoneNumber;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String name, PhoneNumber phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void showContact() {
        System.out.println("Name: " + this.name + "\n" +
                           "Phone number: " + this.phoneNumber.getPhoneNumber() + "\n" +
                           "Address: " + this.address.getAddress() +
                           "\n");
    }

}
