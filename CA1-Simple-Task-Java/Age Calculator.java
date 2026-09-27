import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter Birth Year: ");
        int birthYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Age = " + age);
    }
}