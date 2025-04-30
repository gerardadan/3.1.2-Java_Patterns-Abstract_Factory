package org.lvl2;

public class SpainFactory implements BookFactory {

    @Override
    public Address addAddress() {
        return new SpainAddress();
    }

    @Override
    public PhoneNumber addPhoneNumber() {
        return new SpainPhoneNumber();
    }
}
