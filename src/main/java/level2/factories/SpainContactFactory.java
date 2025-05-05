package level2.factories;

import level2.interfaces.Address;
import level2.interfaces.PhoneNumber;
import level2.model.SpainAddress;
import level2.model.SpainPhoneNumber;

public class SpainContactFactory implements ContactsAbstractFactory {

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new SpainPhoneNumber(number);
    }

    @Override
    public Address createAddress(String street, String number, String city, String postalCode) {
        return new SpainAddress(street, number, city, postalCode);
    }

}
