public class ConstructorsExample {
    String name;
    int age;
    
    public ConstructorsExample(String n, int a) {
        name = n;
        age = a;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        ConstructorsExample person = new ConstructorsExample("Alice", 30);
        person.displayInfo();
    }
}
