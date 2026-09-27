import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double RATE_PER_UNIT = 7.5;

        System.out.print("Enter Units: ");
        int units = sc.nextInt();

        double billAmount = units * RATE_PER_UNIT;

        System.out.println("Electricity Bill = " + billAmount);
    }
}