package org.lvl2;

public class FranceAddress implements Address{
    private final Output output = new Print();

    @Override
    public void get() {
        output.print("Get France address");
    }
}
