class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }
}

class Demo {
    void display(Student s) {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.roll);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha", 25);
        new Demo().display(s);
    }
}