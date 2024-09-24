import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    // Scanner object to be used by all methods
    private static Scanner scanner = new Scanner(System.in);

    // Method to read byte with exception handling
    public static byte readByte(String message) {
        byte result = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println(message);
                result = scanner.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error, please enter a valid byte.");
                scanner.next();  // Clear the invalid input
            }
        }
        return result;
    }

    // Method to read int with exception handling
    public static int readInt(String message) {
        int result = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println(message);
                result = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error, please enter a valid integer.");
                scanner.next();  // Clear the invalid input
            }
        }
        return result;
    }

    // Method to read float with exception handling
    public static float readFloat(String message) {
        float result = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println(message);
                result = scanner.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error, please enter a valid float.");
                scanner.next();  // Clear the invalid input
            }
        }
        return result;
    }

    // Method to read double with exception handling
    public static double readDouble(String message) {
        double result = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println(message);
                result = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error, please enter a valid double.");
                scanner.next();  // Clear the invalid input
            }
        }
        return result;
    }

    // Method to read char with custom exception handling
    public static char readChar(String message) throws Exception {
        System.out.println(message);
        String input = scanner.next();
        if (input.length() != 1) {
            throw new Exception("Please enter only a single character.");
        }
        return input.charAt(0);
    }

    // Method to read string
    public static String readString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    // Method to read yes/no input
    public static boolean readYesNo(String message) {
        boolean valid = false;
        boolean result = false;
        while (!valid) {
            System.out.println(message + " (Enter 's' for yes or 'n' for no)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("s")) {
                result = true;
                valid = true;
            } else if (input.equalsIgnoreCase("n")) {
                result = false;
                valid = true;
            } else {
                System.out.println("Please enter 's' for yes or 'n' for no.");
            }
        }
        return result;
    }

    // Main method to test the Input class
    public static void main(String[] args) {
        // Test the Input class
        byte age = Input.readByte("Enter your age: ");
        System.out.println("Your age: " + age);

        int number = Input.readInt("Enter a number: ");
        System.out.println("Your number: " + number);

        float decimal = Input.readFloat("Enter a float value: ");
        System.out.println("Your float: " + decimal);

        double largeDecimal = Input.readDouble("Enter a double value: ");
        System.out.println("Your double: " + largeDecimal);

        try {
            char character = Input.readChar("Enter a character: ");
            System.out.println("Your character: " + character);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String text = Input.readString("Enter a string: ");
        System.out.println("Your string: " + text);

        boolean yesNo = Input.readYesNo("Do you want to continue?");
        System.out.println("Your response: " + (yesNo ? "Yes" : "No"));
    }
}
