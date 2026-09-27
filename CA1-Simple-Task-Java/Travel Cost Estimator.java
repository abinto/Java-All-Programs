import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Mileage (km/litre): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter Petrol Price (per litre): ");
        double petrolPrice = sc.nextDouble();

        double fuelNeeded = distance / mileage;
        double cost = fuelNeeded * petrolPrice;

        System.out.println("Fuel Needed = " + fuelNeeded + " litres");
        System.out.println("Travel Cost = " + cost);
    }
}