public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale, you must first add products");
    }
}

