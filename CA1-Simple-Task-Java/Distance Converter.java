import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance in KM: ");
        double kilometers = sc.nextDouble();

        double meters = kilometers * 1000;
        double centimeters = meters * 100;

        System.out.println("Meters = " + meters);
        System.out.println("Centimeters = " + centimeters);
    }
}