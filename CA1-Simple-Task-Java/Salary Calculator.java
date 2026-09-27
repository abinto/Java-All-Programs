import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double da = basicSalary * DA_RATE;
        double hra = basicSalary * HRA_RATE;
        double grossSalary = basicSalary + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}