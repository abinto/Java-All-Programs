class Convert {
    static double cToF(double c) {
        return (c * 9/5) + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Fahrenheit = " + Convert.cToF(30));
    }
}