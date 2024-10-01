import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

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
                scanner.next();  // Consume invalid input
            }
        }
        return result;
    }

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
                scanner.next();  // Consume invalid input
            }
        }
        return result;
    }

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
                scanner.next();  // Consume invalid input
            }
        }
        return result;
    }

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
                scanner.next();  // Consume invalid input
            }
        }
        return result;
    }

    public static char readChar(String message) throws Exception {
        System.out.println(message);
        String input = scanner.next();
        if (input.length() != 1) {
            throw new Exception("Please enter only a single character.");
        }
        return input.charAt(0);
    }

    public static String readString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static boolean readYesNo(String message) {
        boolean valid = false;
        boolean result = false;
        while (!valid) {
            System.out.println(message + " (Enter 'y' for yes or 'n' for no)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("y")) {
                result = true;
                valid = true;
            } else if (input.equalsIgnoreCase("n")) {
                result = false;
                valid = true;
            } else {
                System.out.println("Please enter 'y' for yes or 'n' for no.");
            }
        }
        return result;
    }
}


