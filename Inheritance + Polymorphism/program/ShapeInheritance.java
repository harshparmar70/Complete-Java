
class Shape {

    // Method of parent class
    void show() {
        System.out.println("This is a Shape");
    }
}

// Child class 1
class Circle extends Shape {

    void displayCircle() {
        System.out.println("This is a Circle");
    }
}

// Child class 2
class Rectangle extends Shape {

    void displayRectangle() {
        System.out.println("This is a Rectangle");
    }
}

public class ShapeInheritance {

    public static void main(String[] args) {

        // Object of Circle
        Circle c = new Circle();
        c.show();           // inherited method
        c.displayCircle();

        // Object of Rectangle
        Rectangle r = new Rectangle();
        r.show();           // inherited method
        r.displayRectangle();
    }
}
