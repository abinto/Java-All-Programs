import java.util.Scanner;

class Student {
    String name;
    int age;

    Student() {
        this("Manu", 21);
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        new Student();
    }
}