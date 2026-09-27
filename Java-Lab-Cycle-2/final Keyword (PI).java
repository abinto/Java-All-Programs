class Circle {
    final double PI = 3.14;

    double area(double r) {
        return PI * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area = " + c.area(5));
    }
}