# Readme for Exercise: Abstract Factory – International Contact Manager

## 📄 Description

This exercise focuses on the **Abstract Factory Design Pattern** to manage international addresses and phone numbers. You will build a small contact manager (agenda) capable of handling multiple formats depending on the country, encapsulating the creation of regional contact data through abstract factories.

---

## 🚀 Exercise

### Exercise 1: International Contact Manager Using Abstract Factory

You are tasked with designing a contact management system that can handle addresses and phone numbers for different countries, each with its own formatting rules.

#### 🧩 Functionality:
- Implement the **Abstract Factory Pattern** to create families of related objects:
  - International **Address** formats.
  - International **PhoneNumber** formats.
- Each country will have:
  - A specific `Address` implementation.
  - A specific `PhoneNumber` implementation.
  - A corresponding factory that returns both.

#### 🏗️ Required Components:
- **Abstract Factory Interface**: Defines methods to create an `Address` and a `PhoneNumber`.
- **Concrete Factories**: Implementations for specific countries (e.g., `USFactory`, `FranceFactory`, etc.).
- **Product Interfaces**: `Address` and `PhoneNumber` interfaces with format-specific behavior.
- **Concrete Products**: Country-specific implementations (e.g., `USAddress`, `USPhoneNumber`).
- **Agenda** (contact list): Stores contacts composed of an address and phone number.

#### 🚀 Main Class:
- Your `Main` class must:
  - Prompt the user to select a country.
  - Use the corresponding factory to create a contact.
  - Allow the user to input and store the contact's details.
  - Display the list of saved contacts in their respective formats.

---

## 💻 Technologies Used
- Java
- Abstract Factory Design Pattern
- Console I/O (`Scanner`)

## 📋 Requirements
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
