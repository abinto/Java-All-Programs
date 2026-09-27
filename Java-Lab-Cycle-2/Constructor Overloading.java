import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}