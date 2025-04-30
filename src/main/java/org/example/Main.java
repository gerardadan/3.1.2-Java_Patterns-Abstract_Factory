package org.example;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Application app = new Application(factory);

        app.renderUI();
    }
}