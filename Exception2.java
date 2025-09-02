package ExceptionalHandling;

public class Exception2 {
    public static void main(String[] args) {
        try {
            int c = 10, b = 0, a;
            a = c / b; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
