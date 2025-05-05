package level2.factories;

import level2.interfaces.Address;
import level2.interfaces.PhoneNumber;
import level2.model.GermanAddress;
import level2.model.GermanPhoneNumber;

public class GermanContactFactory implements ContactsAbstractFactory {

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new GermanPhoneNumber(number);
    }

    @Override
    public Address createAddress(String street, String number, String city, String postalCode) {
        return new GermanAddress(street, number, city, postalCode);
    }

}
