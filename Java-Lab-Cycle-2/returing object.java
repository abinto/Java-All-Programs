class Student {
    String name;
    int mark;

    Student(String n, int m) {
        name = n;
        mark = m;
    }
}

class Demo {
    Student getStudent() {
        return new Student("Arun", 87);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Demo().getStudent();
        System.out.println("Student Name : " + s.name + " Mark : " + s.mark);
    }
}