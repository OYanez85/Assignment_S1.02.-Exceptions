public class Main_2 {
    public static void main(String[] args) {
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
