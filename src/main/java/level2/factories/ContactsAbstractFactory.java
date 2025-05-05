package level2.factories;

import level2.interfaces.Address;
import level2.interfaces.PhoneNumber;

public interface ContactsAbstractFactory {

    PhoneNumber createPhoneNumber(String number);

    Address createAddress(String street, String number, String city, String postalCode);

}
