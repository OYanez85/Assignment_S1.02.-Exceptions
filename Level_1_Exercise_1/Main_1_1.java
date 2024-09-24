import java.util.ArrayList;
import java.util.List;

// Class for Product with attributes name and price
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

// Custom exception class for EmptySaleException
class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale, you must first add products");
    }
}

// Class for Sale with a collection of products and total price
class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // Method to add a product to the sale
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total price of the sale
    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        System.out.println("Total Price: " + totalPrice);
    }
}

public class Main_1_1 {
    public static void main(String[] args) {
        Sale sale = new Sale();

        // Example: Adding products to the sale
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Phone", 800.00);

        sale.addProduct(p1);
        sale.addProduct(p2);

        // Catch EmptySaleException
        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Catching IndexOutOfBoundsException
        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            // Intentionally accessing an index out of bounds
            System.out.println(numbers.get(5)); // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
