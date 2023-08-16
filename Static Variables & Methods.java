public class StaticExample {
    static int count = 0;
    
    public static void main(String[] args) {
        incrementCounter();
        incrementCounter();
        System.out.println("Count: " + count);
    }
    
    public static void incrementCounter() {
        count++;
    }
}
