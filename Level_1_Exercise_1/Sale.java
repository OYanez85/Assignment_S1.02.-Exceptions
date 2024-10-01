import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {  // Updated exception class name
        if (products.isEmpty()) {
            throw new EmptySaleException();  // Updated exception class name
        }

        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        System.out.println("Total Price: " + totalPrice);
    }
}


