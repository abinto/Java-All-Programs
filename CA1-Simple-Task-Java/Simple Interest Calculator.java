import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DEFAULT_RATE = 5.0;

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = sc.nextDouble();

        double interest = (principal * DEFAULT_RATE * time) / 100;

        System.out.println("Interest = " + interest);
    }
}