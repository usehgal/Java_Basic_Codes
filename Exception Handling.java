public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static int divide(int x, int y) {
        return x / y;
    }
}
