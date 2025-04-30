package org.lvl2;

public class FranceFactory implements BookFactory {

    @Override
    public Address addAddress() {
        return new FranceAddress();
    }

    @Override
    public PhoneNumber addPhoneNumber() {
        return new FrancePhoneNumber();
    }
}
