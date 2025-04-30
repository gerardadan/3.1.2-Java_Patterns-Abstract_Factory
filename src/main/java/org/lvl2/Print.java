package org.lvl2;

public class Print implements Output {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
