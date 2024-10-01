import java.util.ArrayList;
import java.util.List;

public class Main_1 {
    public static void main(String[] args) {
        Sale sale = new Sale();

        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Phone", 800.00);

        sale.addProduct(p1);
        sale.addProduct(p2);

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {  // Updated exception class name
            System.out.println(e.getMessage());
        }

        // Generating and catching IndexOutOfBoundsException
        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);

            // This will cause IndexOutOfBoundsException because index 5 doesn't exist
            System.out.println(numbers.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
