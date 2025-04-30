package org.lvl2;

public class Book {
    private Address address;
    private PhoneNumber phoneNumber;

    public Book(BookFactory bookFactory) {
        address = bookFactory.addAddress();
        phoneNumber = bookFactory.addPhoneNumber();
    }

    public void getContact() {
        address.get();
        phoneNumber.get();
    }
}
