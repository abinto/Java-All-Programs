class Test {
    protected void finalize() {
        System.out.println("finalize() method called");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Object Created");
        t = null;
        System.gc();
    }
}