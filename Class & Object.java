public class Person {
    String name;
    int age;
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.displayInfo();
        
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 25;
        person2.displayInfo();
    }
}
