import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DATA_LIMIT = 30.0;

        System.out.print("Enter Data Used (GB): ");
        double usedData = sc.nextDouble();

        double remainingData = DATA_LIMIT - usedData;

        System.out.println("Used = " + usedData + " GB");
        System.out.println("Remaining = " + remainingData + " GB");
    }
}