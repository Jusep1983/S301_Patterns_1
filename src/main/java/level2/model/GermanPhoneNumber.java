package level2.model;

import level2.interfaces.PhoneNumber;

public class GermanPhoneNumber implements PhoneNumber {
    private final String phoneNumber;

    public GermanPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    @Override
    public String getPhoneNumber() {
        return "+49 " + this.phoneNumber;
    }

}
