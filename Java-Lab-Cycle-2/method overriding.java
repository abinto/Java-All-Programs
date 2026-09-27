class Demo {
    void display(int a) {
        System.out.println("Integer : " + a);
    }

    void display(double b) {
        System.out.println("Double : " + b);
    }

    void display(String c) {
        System.out.println("String : " + c);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}