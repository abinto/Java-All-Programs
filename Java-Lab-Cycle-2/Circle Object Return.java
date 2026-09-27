class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Radius = " + c.r + " Area = " + c.area());
    }
}