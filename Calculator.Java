public class Calculator {

    // Static method: no need to create an object
    public static int add(int a, int b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator.add(5, 3));
        System.out.println("Multiplication: " + Calculator.multiply(2.5, 4));
        System.out.println("Division: " + Calculator.divide(10, 2));
    }
}
