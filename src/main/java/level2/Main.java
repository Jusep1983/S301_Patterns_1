package level2;

import level2.factories.GermanContactFactory;
import level2.factories.SpainContactFactory;
import level2.model.AddressBook;
import level2.model.Contact;

public class Main {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        SpainContactFactory spainFactory = new SpainContactFactory();
        GermanContactFactory germanFactory = new GermanContactFactory();

        Contact spainContact = new Contact(
                "Joselito Huevofrito",
                spainFactory.createPhoneNumber("936912345"),
                spainFactory.createAddress("Aragon", "55", "Barcelona", "08080")
        );

        Contact germanContact = new Contact(
                "Frank Furt",
                germanFactory.createPhoneNumber("111222333"),
                germanFactory.createAddress("Haupt", "5A", "Hamburg", "54321")
        );

        addressBook.addContact(spainContact);
        addressBook.addContact(germanContact);
        addressBook.showAllContacts();

    }

}
