public class Task9A {
    public static void main(String[] args) {
        int a = 15, b = 25;

        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}