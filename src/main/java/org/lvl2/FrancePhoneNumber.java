package org.lvl2;

public class FrancePhoneNumber implements PhoneNumber{
    private final Output output = new Print();

    @Override
    public void get() {
        output.print("Get france phone number");
    }
}
