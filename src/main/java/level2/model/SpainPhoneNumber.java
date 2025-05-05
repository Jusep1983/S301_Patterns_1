package level2.model;

import level2.interfaces.PhoneNumber;

public class SpainPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public SpainPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + this.phoneNumber;
    }

}
