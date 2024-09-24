# S1.02.-Exceptions
S1.02. Exceptions

📄 Repository Content
Each repository must contain a README.md file with the following sections:

📄 Description - Exercise Statements

- Level 1 - Exercise 1
  
Create a class called "Product" with attributes name and price, and another class called "Sale". This class contains attributes for a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws a custom exception "EmptySaleException" and displays on the screen "To make a sale, you must first add products" if the product collection is empty. If the collection has products, it must iterate through the collection and store the sum of all product prices in the total price attribute of the sale.

The custom exception "EmptySaleException" must extend the Exception class. In its constructor, we need to pass the message "To make a sale, you must first add products" and when we catch the exception, we need to display it on the screen using the getMessage() method of the exception.

Write the necessary code to generate and catch an IndexOutOfBoundsException.

- Level 2 - Exercise 1
  
Create a class called "Input". This class will be used to control the different exceptions that can occur in Java when entering data via the keyboard using the Scanner class.

The first thing to do is instantiate an object of the Scanner class, and from there, create static methods to read different types of data from the keyboard.

Important
If any method throws an exception, it should be handled and the user must be prompted to re-enter the data until it is entered correctly. For example: If a float is entered with a dot instead of a comma, it should display "Format error". Until the user enters a correctly formatted float, the program should continue asking for the input.

All methods receive a String with the message to display to the user, such as: "Enter your age", and they return the appropriate data input by the user in each method. For example: a byte with the user's age.

Methods to be implemented, capturing the exception from the InputMismatchException class:

public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);
Methods to be implemented, capturing a custom exception from the Exception class:

public static char readChar(String message);
public static String readString(String message);
public static boolean readYesNo(String message); // if the user enters "s", returns `true`, if the user enters "n", returns `false`.

- Level 3 - Exercise 1

A well-known cinema company has asked us to develop an application for seat reservations in their cinemas. The application will be used by sellers when selling tickets.

Functionality
Once the application starts, it will ask the user how many rows and how many seats per row the cinema hall has. Once the data is entered, the following menu will be displayed:

Show all reserved seats.
Show seats reserved by a person.
Reserve a seat.
Cancel a seat reservation.
Cancel all reservations for a person.
Exit.
Classes
Main Class: Contains the main method where an object of the "Cinema" class is instantiated and its start method is called.
Seat Class: Manages the data of a seat, including attributes for row number, seat number, and the person reserving the seat.
Cinema Class: Contains the attributes and initialization method for managing rows, seats per row, and seat management logic.
Seat Management Class: Manages the seat reservation operations through methods for adding, removing, and searching for seats in an ArrayList.

💻 Technologies Used
Java

📋 Requirements
Java Development Kit (JDK) version 11 or higher.
A suitable IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VSCode).
Command Line Interface (CLI) for executing the Java program.

🛠️ Installation
Clone the repository:

git clone https://github.com/OYanez85/Java.git

Navigate to the project directory:

cd Java
Compile the Java files:

javac Main.java

▶️ Execution
Run the Java program:

java Main
Follow the on-screen instructions for interacting with the program.

🌐 Deployment
Deploy the application in your preferred environment.
Ensure the appropriate runtime environment (Java JDK) is set up on the server.
Use a production-ready deployment method (e.g., packaging into a JAR file).

🤝 Contributions
Contributions are welcome! Please follow these steps to contribute:

Fork the repository.
Create a new branch:

git checkout -b feature/NewFeature
Make your changes and commit them:

git commit -m "Add New Feature"
Push the changes to your branch:

git push origin feature/NewFeature
Open a pull request and describe your changes.
