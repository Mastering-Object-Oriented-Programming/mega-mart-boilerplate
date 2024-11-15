# Capstone Project: MegaMart

## Objective
Utilize the concepts learned from the "Mastering Object-Oriented Programming in Java" sessions to design and implement a console-based application. The project should showcase the principles of object-oriented design through well-structured classes, inheritance, and interfaces that interact seamlessly in a console environment.

## Project Description
The **MegaMart** application is a simplified console-based platform. The goal is to develop a functional application where users can register as customers, browse products, and make purchases directly through the command line interface (CLI). This project focuses on implementing an intuitive console experience, with clear and concise outputs for every action, while adhering to object-oriented programming principles.

## Project Requirements

1. **Classes and Inheritance**:
    - Design a `Customer` base class to represent generic customer details and actions.
    - Extend `Customer` with `RegularCustomer` and `PremiumCustomer` classes, each with unique features or discounts.
    - Create a `Product` base class to represent items in MegaMart’s inventory, with fields for product details.
    - Extend `Product` to specific types like `Laptop` and `Camera`, each with unique attributes.

2. **Interfaces and Implementations**:
    - Define a `CustomerService` interface with essential methods like `buyProduct(Product)` and `displayCustomerDetails(Customer)` for managing customer accounts.
    - Implement `CustomerService` in `CustomerServiceImpl`, which provides the functionality for customer registration, login, and retrieving customer information.
    - Create a `ProductService` interface with methods such as `displayAllProducts()` and `displayProductDetails(Product)`.
    - Implement `ProductService` in `ProductServiceImpl`, handling product display and purchasing logic.

   
3. **Console Output and Interaction**:
    - All interactions should occur through the command line, with prompts and responses displayed using `System.out.println`.


## Additional Guidelines
- Use encapsulation to keep data fields private and manage data access through getter and setter methods.
- Demonstrate polymorphism through interactions between interfaces and their implementing classes.
- Organize code into methods that are clear and modular, with comments describing each class and method purpose.

