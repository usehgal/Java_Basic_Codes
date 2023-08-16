interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        
        Shape square = new Square();
        square.draw();
    }
}
