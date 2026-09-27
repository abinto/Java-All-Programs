class Box {
    int l, b, h;

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume() {
        return l * b * h;
    }
}

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(3,4,5);
        Box b2 = new Box(5,4,6);

        int v1 = b1.volume();
        int v2 = b2.volume();

        System.out.println("Larger Box Volume = " + Math.max(v1, v2));
    }
}