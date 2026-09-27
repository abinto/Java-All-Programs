import java.util.Scanner;

public class StudentInformationDisplay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int rollNo;
        String course;
        double percentage;

        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Roll No: ");
        rollNo = input.nextInt();
        input.nextLine(); // Clear buffer

        System.out.print("Course: ");
        course = input.nextLine();

        System.out.print("Percentage: ");
        percentage = input.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        input.close();
    }
}