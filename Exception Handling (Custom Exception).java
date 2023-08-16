class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void validateAge(int age) throws AgeException {
        if (age < 0 || age > 120) {
            throw new AgeException("Invalid age");
        }
    }
    
    public static void main(String[] args) {
        int age = 150;
        try {
            validateAge(age);
            System.out.println("Age is valid");
        } catch (AgeException e) {
            System.out.println("AgeException: " + e.getMessage());
        }
    }
}
