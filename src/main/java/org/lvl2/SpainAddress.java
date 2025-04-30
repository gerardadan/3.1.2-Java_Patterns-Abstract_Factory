package org.lvl2;

public class SpainAddress implements Address{
    private final Output output = new Print();

    @Override
    public void get() {
        output.print("Get spain address");
    }
}
