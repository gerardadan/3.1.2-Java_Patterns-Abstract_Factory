package org.lvl2;

public class Main {
    public static void main(String[] args) {
        BookFactory bookFactory = new SpainFactory();
        Book book = new Book(bookFactory);
        book.getContact();

        bookFactory = new FranceFactory();
        book = new Book(bookFactory);
        book.getContact();
    }
}