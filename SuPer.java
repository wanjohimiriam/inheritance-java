class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
        super.draw(); // Call the draw() method of the immediate parent class
    }
}

public class SuPer {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle circle = new Circle();
        // Call the draw() method on the Circle instance
        circle.draw();
    }
}

