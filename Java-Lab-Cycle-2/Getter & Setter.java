class Student {
    private String name;
    private int age;

    void set(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Student Name : " + name + " Age : " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.set("Maya", 19);
        s.display();
    }
}