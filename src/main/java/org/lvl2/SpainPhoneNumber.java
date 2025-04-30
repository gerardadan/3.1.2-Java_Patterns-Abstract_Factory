package org.lvl2;

public class SpainPhoneNumber implements PhoneNumber{
    private final Output output = new Print();

    @Override
    public void get() {
        output.print("Get spain phone number");
    }
}
