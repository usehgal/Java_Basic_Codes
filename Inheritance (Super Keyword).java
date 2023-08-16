class ParentClass {
    int x;
    
    ParentClass(int x) {
        this.x = x;
    }
}

class ChildClass extends ParentClass {
    int y;
    
    ChildClass(int x, int y) {
        super(x);
        this.y = y;
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        ChildClass child = new ChildClass(10, 20);
        System.out.println("x: " + child.x);
        System.out.println("y: " + child.y);
    }
}
