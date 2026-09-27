import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.05;
        final double SERVICE_CHARGE_RATE = 0.10;

        System.out.print("Enter Food Cost: ");
        double foodCost = sc.nextDouble();

        double gst = foodCost * GST_RATE;
        double serviceCharge = foodCost * SERVICE_CHARGE_RATE;
        double finalBill = foodCost + gst + serviceCharge;

        System.out.println("GST = " + gst);
        System.out.println("Service Charge = " + serviceCharge);
        System.out.println("Final Bill = " + finalBill);
    }
}