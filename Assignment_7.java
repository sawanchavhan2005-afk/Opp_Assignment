// Q7. Create abstract class Shape with abstract method calculate_area()
// and concrete method display_info()
// Create subclasses Circle and Rectangle implementing calculate_area()
abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("Shape info");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculate_area() {
        return Math.PI * r * r;
    }
}