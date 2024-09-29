import java.util.ArrayList;
import java.util.List;


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


class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale, you must first add products");
    }
}


class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    
    public void addProduct(Product product) {
        products.add(product);
    }

    
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

        
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Phone", 800.00);

        sale.addProduct(p1);
        sale.addProduct(p2);

    
        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            
            System.out.println(numbers.get(5)); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
